package Clase7Dia8EjercicioN1.Clase7Dia8EjercicioN1.service;

import Clase7Dia8EjercicioN1.Clase7Dia8EjercicioN1.model.Vehicles;

import java.util.List;
import java.util.Optional;

public interface IVehiclesService {

    public List<Vehicles> getSampleVehicleList();

    public List<Vehicles>  getVehiclesByPrice();

    public Optional<Vehicles> getVehicleById(int id );

    public Vehicles addVehicle(Vehicles vehicle);
}
