package Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.controller;

import Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.Services.ICalificacionesService;
import Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.model.Calificaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CalificacionesController {

    @Autowired
    private ICalificacionesService calificacionService;

    @GetMapping("/calificaciones/{numMatricula}")
    public List<Calificaciones> obtenerCalificacionesPorMatricula(@PathVariable int  numMatricula) {
        return calificacionService.obtenerCalificacionesPorMatricula(numMatricula);

    }
    @GetMapping("/calificacionesDescendente")
    public List<Calificaciones> obtenerCalificacionesOrdenDescendente() {
        return calificacionService.obtenerCalificacionesOrdenDescendente();
    }
}
