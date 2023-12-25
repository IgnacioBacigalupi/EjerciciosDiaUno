package Clase7Dia8EjercicioN1.Clase7Dia8EjercicioN1.service;

import Clase7Dia8EjercicioN1.Clase7Dia8EjercicioN1.model.Vehicles;
import Clase7Dia8EjercicioN1.Clase7Dia8EjercicioN1.repository.VehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehiclesService implements IVehiclesService {

    @Autowired
    VehiclesRepository vehicleRepository;


    @Override
    public List<Vehicles> getSampleVehicleList() {
        return vehicleRepository.getSampleVehicleList();
    }

    @Override
    public List<Vehicles> getVehiclesByPrice() {
        List<Vehicles> vehicles = vehicleRepository.getSampleVehicleList();
        return vehicles.stream()
                .sorted(Comparator.comparing(Vehicles::getPrice))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Vehicles> getVehicleById(int id ) {
        List<Vehicles> vehicles = vehicleRepository.getSampleVehicleList();
         Optional<Vehicles> vehicle = vehicles.stream()
                 .filter(v -> v.getId() == id)
                 .findFirst();
         return vehicle;
    }

    @Override
    public Vehicles addVehicle( Vehicles vehicle) {
       vehicleRepository.addVehicle(vehicle);
        return vehicle;
    }
}
