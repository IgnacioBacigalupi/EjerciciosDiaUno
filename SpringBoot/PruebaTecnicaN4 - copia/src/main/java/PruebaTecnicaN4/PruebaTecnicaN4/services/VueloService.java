package PruebaTecnicaN4.PruebaTecnicaN4.services;

import PruebaTecnicaN4.PruebaTecnicaN4.dto.VueloDto;
import PruebaTecnicaN4.PruebaTecnicaN4.model.ReservaVuelo;
import PruebaTecnicaN4.PruebaTecnicaN4.model.Vuelo;
import PruebaTecnicaN4.PruebaTecnicaN4.repositories.ReservaVueloRepository;
import PruebaTecnicaN4.PruebaTecnicaN4.repositories.VueloRepository;
import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class VueloService  implements IVueloService{

    @Autowired
    private VueloRepository vueloRepository;

    @Autowired
    private ReservaVueloRepository reservaVueloRepository;
    @Override
    public Vuelo crearVuelo(VueloDto vueloDto) {
        LocalDate fechaActual = LocalDate.now();
        if(vueloDto.getFecha().isAfter(fechaActual)|| vueloDto.getFecha().isEqual(fechaActual)) {
            System.out.println("Fecha actual : " + fechaActual);
            System.out.println("Fecha del vuelo : " + vueloDto.getFecha());

            Vuelo vuelo = new Vuelo();

            vuelo.setOrigen(vueloDto.getOrigen());
            vuelo.setDestino(vueloDto.getDestino());

            String letrasOrigen = vuelo.getOrigen().isEmpty() ? "00" : vuelo.getOrigen().substring(0, Math.min(2, vuelo.getOrigen().length()));
            String letrasDestino = vuelo.getDestino().isEmpty() ? "DD" : vuelo.getDestino().substring(0, Math.min(2, vuelo.getDestino().length()));

            Random rand = new Random();
            String numeroFormateado = String.format("%04d", rand.nextInt(10000));

            String codigoVuelo = letrasOrigen + letrasDestino + "-" + numeroFormateado;
            vuelo.setNumeroVuelo(codigoVuelo.toUpperCase());
            vuelo.setTipoDeAsiento(vueloDto.getTipoDeAsiento());
            vuelo.setPrecioVuelo(vueloDto.getPrecioVuelo());

            vuelo.setFecha(vueloDto.getFecha());
            vuelo.setEstado(false);

            return vueloRepository.save(vuelo);
        }   else {
            System.out.println("No se puede crear un vuelo en el pasado.");
            return null;
        }


    }

    public void actualizarEstadoVuelo(Vuelo vuelo) {
        vuelo.setEstado(true);
        vueloRepository.save(vuelo);
    }

    @Override
    public List<Vuelo> obtenerTodosLosVuelosPorFechaYLugar(LocalDate disponibleDesde, LocalDate disponiblehasta, String origen, String destino) {
        return vueloRepository.obtenerTodosLosVuelosPorFecha(disponibleDesde , disponiblehasta , origen , destino);
    }

    @Override
    public List<Vuelo> obtenerTodosLosVuelos() {
        List<Vuelo> vuelos = vueloRepository.findAll();
        List<Vuelo>  vuelosFiltrados = new ArrayList<>();

        for (Vuelo v : vuelos) {
            if(!v.isEstado()){
                vuelosFiltrados.add(v);
            }
        }
        return vuelosFiltrados;
    }


    @Override
    public Vuelo borrarVueloPorId(long id) {
        Optional<Vuelo> optionalVuelo = vueloRepository.findById(id);

        if (((Optional<?>) optionalVuelo).isPresent()) {
            Vuelo vuelo = optionalVuelo.get();

            List<ReservaVuelo> reservasVuelo = reservaVueloRepository.findReservasByVuelo(vuelo);
            if (!reservasVuelo.isEmpty()) {
                // Verificar si hay reservas asociadas a este vuelo
                boolean hayReservasActivas = reservasVuelo.stream().anyMatch(ReservaVuelo::isReservado);
                if (hayReservasActivas) {
                    // Si hay reservas activas, no se puede borrar
                    System.out.println("No se puede borrar el vuelo. Tiene reservas activas.");
                    return null;
                }
            }

            vueloRepository.delete(vuelo);
            return vuelo;
        } else {
            System.out.println("El ID del vuelo no está registrado en la base de datos.");
            return null;
        }
    }

}
