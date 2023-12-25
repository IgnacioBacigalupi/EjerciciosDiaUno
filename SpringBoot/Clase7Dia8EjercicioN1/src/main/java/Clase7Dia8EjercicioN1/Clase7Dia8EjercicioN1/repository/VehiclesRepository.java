package Clase7Dia8EjercicioN1.Clase7Dia8EjercicioN1.repository;

import Clase7Dia8EjercicioN1.Clase7Dia8EjercicioN1.model.Vehicles;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehiclesRepository {
    // Lista estática para almacenar los vehículos
    private static List<Vehicles> vehiclesList = new ArrayList<>();

    // Método para obtener la lista de vehículos
    public List<Vehicles> getSampleVehicleList() {
        return vehiclesList;
    }

    // Método para agregar un vehículo a la lista
    public void addVehicle(Vehicles vehicle) {
        vehiclesList.add(vehicle);
    }

    // Inicialización de la lista con vehículos
    static {
        vehiclesList.add(new Vehicles(1, "Toyota", "Corolla", 15000L, 4, 18000.0));
        vehiclesList.add(new Vehicles(2, "Honda", "Civic", 12000L, 4, 17000.0));
        vehiclesList.add(new Vehicles(3, "Ford", "Focus", 20000L, 4, 16000.0));
        vehiclesList.add(new Vehicles(4, "BMW", "X5", 10000L, 4, 45000.0));
        vehiclesList.add(new Vehicles(5, "Mercedes-Benz", "C-Class", 18000L, 4, 35000.0));
        vehiclesList.add(new Vehicles(6, "Audi", "A4", 13000L, 4, 30000.0));
        vehiclesList.add(new Vehicles(7, "Volkswagen", "Golf", 14000L, 4, 20000.0));
        vehiclesList.add(new Vehicles(8, "Nissan", "Altima", 11000L, 4, 15000.0));
        vehiclesList.add(new Vehicles(9, "Chevrolet", "Malibu", 17000L, 4, 22000.0));
        vehiclesList.add(new Vehicles(10, "Hyundai", "Elantra", 16000L, 4, 19000.0));
    }

}
