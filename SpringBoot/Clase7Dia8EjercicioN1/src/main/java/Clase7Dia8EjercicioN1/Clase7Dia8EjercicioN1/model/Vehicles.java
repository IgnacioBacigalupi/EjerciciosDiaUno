package Clase7Dia8EjercicioN1.Clase7Dia8EjercicioN1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicles {
    private int id;

    private String brand;

    private String model;

    private Long kilometers;

    private int doors;

    private double price;
}
