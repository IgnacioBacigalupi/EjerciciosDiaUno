package Clase7Dia8EjercicioN1.Clase7Dia8EjercicioN1.controller;

import Clase7Dia8EjercicioN1.Clase7Dia8EjercicioN1.model.Vehicles;
import Clase7Dia8EjercicioN1.Clase7Dia8EjercicioN1.service.IVehiclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VehiclesController {
    @Autowired
    IVehiclesService vehiclesService;
    @GetMapping("/vehicles")
    public List<Vehicles> getSampleVehicleList() {
        return vehiclesService.getSampleVehicleList();
    }
    @GetMapping("/vehicles/prices")

    public List<Vehicles> VehiclesByPrice() {
        return vehiclesService.getVehiclesByPrice();
    }
@GetMapping("/vehicles/{id}")
    public Optional<Vehicles> getVehicleById(@PathVariable int id ) {
        return vehiclesService.getVehicleById(id);
    }
    @PostMapping("/vehicle")
    public Vehicles addVehicle( @RequestBody  Vehicles vehicle){
        return vehiclesService.addVehicle(vehicle);
    }
}
