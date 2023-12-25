package Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.Services;

import Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.Repository.EstudiantesRepository;
import Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.model.Calificaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalificacionesService implements ICalificacionesService {
    @Autowired
    private EstudiantesRepository estudiantesRepository;

    @Override
    public List<Calificaciones> obtenerCalificacionesPorMatricula(int numMatricula) {
        List<Calificaciones> calificaciones = estudiantesRepository.obtenerCalificaciones();

        List<Calificaciones> calificacionesEstudiante = calificaciones.stream()
                .filter(calificacion -> calificacion.getAlumno().getNumMatricula() == numMatricula)
                .collect(Collectors.toList());

        return calificacionesEstudiante;

    }

    @Override
    public List<Calificaciones> obtenerCalificacionesOrdenDescendente() {
        List<Calificaciones> calificaciones = estudiantesRepository.obtenerCalificaciones();

        // Ordenar las calificaciones por promedio en orden descendente
        List<Calificaciones> calificacionesOrdenadas = calificaciones.stream()
                .sorted(Comparator.comparingDouble(Calificaciones::getPromedio).reversed())
                .collect(Collectors.toList());

        return calificacionesOrdenadas;
    }
}

