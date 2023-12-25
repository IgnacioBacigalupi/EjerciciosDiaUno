package Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.controller;

import Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.Services.ICalificacionesService;
import Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.Services.IEstudianteService;
import Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.model.Calificaciones;
import Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstudiantesController {
        @Autowired
        private IEstudianteService estudianteService;

        @GetMapping("/estudiantes")
        public List<Estudiante> obtenerTodosLosEstudiantes() {
            return estudianteService.obtenerTodosLosEstudiantes();

        }

}
