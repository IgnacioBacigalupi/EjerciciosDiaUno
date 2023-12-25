package Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.Repository;

import Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.model.Calificaciones;
import Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.model.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EstudiantesRepository {
    public  List<Estudiante> obtenerEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        // Simulación de estudiantes
        estudiantes.add(new Estudiante(1, "Juan", "Perez", "1998-05-15"));
        estudiantes.add(new Estudiante(2, "Maria", "Gomez", "1997-09-22"));
        estudiantes.add(new Estudiante(3, "Luis", "Rodriguez", "1999-02-10"));
        // Agregar más estudiantes si es necesario
        return estudiantes;
    }
    public  List<Calificaciones> obtenerCalificaciones() {
        List<Calificaciones> calificaciones = new ArrayList<>();

        List<Estudiante> estudiantes = obtenerEstudiantes();
        calificaciones.add(new Calificaciones(1, 80, 75, 90, 81.67, estudiantes.get(0)));
        calificaciones.add(new Calificaciones(2, 85, 90, 78, 84.33, estudiantes.get(1)));
        calificaciones.add(new Calificaciones(3, 92, 88, 85, 88.33, estudiantes.get(2)));

        return calificaciones;
    }
}
