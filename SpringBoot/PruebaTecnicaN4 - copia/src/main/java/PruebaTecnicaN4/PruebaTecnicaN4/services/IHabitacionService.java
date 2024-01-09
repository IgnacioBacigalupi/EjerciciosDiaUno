package PruebaTecnicaN4.PruebaTecnicaN4.services;

import PruebaTecnicaN4.PruebaTecnicaN4.model.Habitacion;

import java.util.List;

public interface IHabitacionService {


    Habitacion createHabitacion (Habitacion habitacion) ;

    List<Habitacion> getAllHabitacion() ;
}
