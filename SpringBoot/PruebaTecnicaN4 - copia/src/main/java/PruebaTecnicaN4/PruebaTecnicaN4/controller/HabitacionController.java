package PruebaTecnicaN4.PruebaTecnicaN4.controller;

import PruebaTecnicaN4.PruebaTecnicaN4.model.Habitacion;
import PruebaTecnicaN4.PruebaTecnicaN4.model.Hotel;
import PruebaTecnicaN4.PruebaTecnicaN4.services.IHabitacionService;
import PruebaTecnicaN4.PruebaTecnicaN4.services.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habitaciones")
public class HabitacionController {
    @Autowired
    private IHabitacionService habitacionService;


    @PostMapping("/new")
       public ResponseEntity<?> crearHabitacion(@RequestBody  Habitacion habitacion) {
           habitacionService.createHabitacion(habitacion);
           return ResponseEntity.ok().body("Habitacion creada");
       }



}
