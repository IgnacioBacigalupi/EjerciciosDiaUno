package org.example;

import org.example.logica.Platillo;
import org.example.persistencia.ControladoraPersistencia;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ControladoraPersistencia controlador = new ControladoraPersistencia();

        Platillo platillo = new Platillo(1L,"Arroz Con Salsa","Arroz mas salsa", 10.36);
        Platillo platillo1 = new Platillo(2L,"Huevos revueltos","Huevos", 45.23);
        Platillo platillo2 = new Platillo(3L,"Carne al horno","Carne y papas", 15.32);

    //Dar de alta el platillo

        controlador.crearPlatillo(platillo);
        controlador.crearPlatillo(platillo1);
        controlador.crearPlatillo(platillo2);

    //Eliminar un platillo
        controlador.borrarPlatillo(2L);




    }
}