package PruebaTecnicaN4.PruebaTecnicaN4.controller;

import PruebaTecnicaN4.PruebaTecnicaN4.dto.VueloDto;
import PruebaTecnicaN4.PruebaTecnicaN4.model.ReservaVuelo;
import PruebaTecnicaN4.PruebaTecnicaN4.model.Vuelo;
import PruebaTecnicaN4.PruebaTecnicaN4.repositories.ReservaVueloRepository;
import PruebaTecnicaN4.PruebaTecnicaN4.repositories.VueloRepository;
import PruebaTecnicaN4.PruebaTecnicaN4.services.IVueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/agency")
public class VueloController {


    @Autowired
    private IVueloService vueloService;
    @Autowired
    private VueloRepository vueloRepository;
    @Autowired
    private ReservaVueloRepository reservaVueloRepository;



    @PostMapping("/flight/new")
    public ResponseEntity<?> crearVuelo (@RequestBody VueloDto vueloDto) {
        Vuelo vuelo= vueloService.crearVuelo(vueloDto);
        if(vuelo==null){
            return ResponseEntity.badRequest().body("El vuelo no puede ser creado en el pasado");
        }
        return ResponseEntity.ok().body("Vuelo creado ");
    }


    @GetMapping("/flights/search")
    public List<Vuelo> obtenerTodosLosVuelosPorFechaYLugar(@RequestParam LocalDate fecha1,
                                                           @RequestParam LocalDate fecha2,
                                                           @RequestParam String origen,
                                                           @RequestParam String destino){
        return vueloService.obtenerTodosLosVuelosPorFechaYLugar(fecha1, fecha2, origen, destino);
    }


    @GetMapping("/flights")
    public List<Vuelo> obtenerTodosLosVuelos(){
       return vueloService.obtenerTodosLosVuelos();
    }

  //Metodo para borrar vuelo por id
  @DeleteMapping("/flight/{id}")
  public ResponseEntity<?> borrarVueloPorId(@PathVariable Long id){
      Vuelo vueloBorrado = vueloService.borrarVueloPorId(id);
      if (vueloBorrado == null) {
          // Verificar si el vuelo está reservado
          Vuelo vuelo = vueloRepository.findById(id).orElse(null);
          if (vuelo != null) {
              List<ReservaVuelo> reservasVuelo = reservaVueloRepository.findReservasByVuelo(vuelo);
              boolean hayReservasActivas = reservasVuelo.stream().anyMatch(ReservaVuelo::isReservado);
              if (hayReservasActivas) {
                  return ResponseEntity.badRequest().body("No se puede borrar el vuelo. Tiene una reserva activa.");
              }
          }
          return ResponseEntity.badRequest().body("El ID del vuelo no está registrado.");
      }
      return ResponseEntity.ok().body("Vuelo borrado");
  }



}
