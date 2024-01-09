package PruebaTecnicaN4.PruebaTecnicaN4.services;

import PruebaTecnicaN4.PruebaTecnicaN4.dto.HotelDto;
import PruebaTecnicaN4.PruebaTecnicaN4.model.Habitacion;
import PruebaTecnicaN4.PruebaTecnicaN4.model.Hotel;
import PruebaTecnicaN4.PruebaTecnicaN4.repositories.HabitacionRepository;
import PruebaTecnicaN4.PruebaTecnicaN4.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.text.Normalizer;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class HotelService implements IHotelService {

    @Autowired
    private HotelRepository hotelRepository;
    @Autowired
    private HabitacionRepository habitacionRepository;

    @Override
    public Hotel crearHotel(HotelDto hotelDto) {

        Hotel hotel = new Hotel();

        hotel.setNombre(hotelDto.getNombre());
        hotel.setUbicacion(hotelDto.getUbicacion());


        String[] partesNombre = hotel.getNombre().split(" ");
        String[] partesNombreScript = hotel.getNombre().split("-");
        String[] palabraSola = hotel.getNombre().split("[^\\p{L}]+");

        StringBuilder codigoHotel = new StringBuilder();

        if(partesNombreScript.length >= 2 ){
            System.out.println("Processing parts with script con guion");
            for(String part : partesNombreScript){
                System.out.println("Processing part: " + part);
                if(part.matches("[\\p{L}]+")){
                    String letrasSolo = Normalizer.normalize(part, Normalizer.Form.NFD).replaceAll("[^\\p{L}]" , "");
                    codigoHotel.append(letrasSolo.length()>=1 ? letrasSolo.substring(0,1): "");
                    System.out.println("Result so far: " + codigoHotel.toString());
                }
            }
        } else if (palabraSola.length == 1 && palabraSola[0].matches("[\\p{L}]+")) {
            System.out.println("Processing single word: " + palabraSola[0]);
            String letrasSolo = Normalizer.normalize(palabraSola[0], Normalizer.Form.NFD).replaceAll("[^\\p{L}]", "");
            codigoHotel.append(letrasSolo.substring(0, Math.min(3, letrasSolo.length())));
            System.out.println("Result so far: " + codigoHotel.toString());

        } else if (partesNombre.length >= 2) {
            System.out.println("Processing parts without script sin guion");
            for(String part : partesNombre){
                if(part.matches("[\\p{L}]+")){
                    System.out.println("Processing part: " + part);
                    String letrasSolo = Normalizer.normalize(part, Normalizer.Form.NFD).replaceAll("[^\\p{L}]", "");
                    codigoHotel.append(letrasSolo.length() >= 1 ? letrasSolo.substring(0,1) : "");
                    System.out.println("Result so far: " + codigoHotel.toString());
                }
            }
        }

        Random random = new Random();

        codigoHotel.append("-")
                .append(random.nextInt(10))
                .append(random.nextInt(10))
                .append(random.nextInt(10))
                .append(random.nextInt(10));


        hotel.setCodigoHotel(codigoHotel.toString().toUpperCase());
        return hotelRepository.save(hotel);
    }





    @Override
    public List<Hotel> obtenerHotelPorFechayLugar(LocalDate disponibleDesde, LocalDate disponibleHasta, String ubicacion) {
        List<Habitacion> habitaciones = habitacionRepository.encontrarHabitacionDisponibleAndUbicacion(disponibleDesde, disponibleHasta, ubicacion);
             return habitaciones.stream().map(Habitacion::getHotel).collect(Collectors.toList()) ;
    }

    @Override
    public List<Hotel> obtenerTodosLosHoteles() {
        return hotelRepository.findAll();
    }
}
