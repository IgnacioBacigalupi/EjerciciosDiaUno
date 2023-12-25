package Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.Services;

import Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.model.Calificaciones;

import java.util.List;

public interface ICalificacionesService {
    List<Calificaciones> obtenerCalificacionesPorMatricula(int numMatricula);

    List<Calificaciones> obtenerCalificacionesOrdenDescendente();
}
