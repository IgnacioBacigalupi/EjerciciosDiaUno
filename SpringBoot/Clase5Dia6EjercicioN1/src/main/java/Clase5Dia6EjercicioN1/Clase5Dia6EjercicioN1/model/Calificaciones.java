package Clase5Dia6EjercicioN1.Clase5Dia6EjercicioN1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Calificaciones {
    private int id;
    private int calificacion1;
    private int calificacion2;
    private int calificacion3;
    private double promedio;
    private Estudiante alumno;
}
