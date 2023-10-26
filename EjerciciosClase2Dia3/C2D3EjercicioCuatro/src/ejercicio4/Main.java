package ejercicio4;

import java.util.Scanner;

/*Ejercicio Nº 4 - Matrices - Grupal

Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:

Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").

Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2"). El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.

Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.

A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.

Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro. ¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?

El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.

Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra.
* */public class Main {
    public static void main(String[] args) {
        String[][] teatro = new String[5][5];
        boolean exit = false;
        int filaSeleccionada = 0 ;
        int asientoSeleccionado = 0;

        // Rellenar la cuadrícula con "O"
        for (int fila = 0; fila < 5; fila++) {
            for (int asiento = 0; asiento < 5; asiento++) {
                teatro[fila][asiento] = "O";
            }
        }
        // Imprimir la cuadrícula actualizada
        for (int fila = 0; fila < 5; fila++) {
            for (int asiento = 0; asiento < 5; asiento++) {
                System.out.print("+---");
            }
            System.out.println("+");

            for (int asiento = 0; asiento < 5; asiento++) {
                System.out.print("| " + teatro[fila][asiento] + " ");
            }
            System.out.println("|");
        }

        for (int asiento = 0; asiento < 5; asiento++) {
            System.out.print("+---");
        }
        System.out.println("+");

        Scanner scanner = new Scanner(System.in);

        // Bucle para seleccionar tanto filas como asientos
        while (!exit) {

            if (teatro[filaSeleccionada][asientoSeleccionado].equalsIgnoreCase("X") ){
                System.out.println("El asiento " + asientoSeleccionado + " ha sido ocupado.");
                System.out.println("Elige otro asiento por favor");
            }

            // Solicitar al usuario la fila y el asiento a marcar con "X"
            System.out.print("Ingresa la fila (0-4): ");
            filaSeleccionada = scanner.nextInt();

            System.out.print("Ingresa el asiento (0-4): ");
            asientoSeleccionado = scanner.nextInt();

            // Validar la entrada del usuario
            if (filaSeleccionada >= 0 && filaSeleccionada < 5 && asientoSeleccionado >= 0 && asientoSeleccionado < 5) {
                // Marcar la fila y el asiento seleccionados con "X"
                teatro[filaSeleccionada][asientoSeleccionado] = "X";


            } else {
                System.out.println("Entrada no válida. La fila y el asiento deben estar en el rango de 0 a 4.");
            }

            // Imprimimos los asientos finales
            // Imprimir la cuadrícula actualizada
            for (int fila = 0; fila < 5; fila++) {
                for (int asiento = 0; asiento < 5; asiento++) {
                    System.out.print("+---");
                }
                System.out.println("+");

                for (int asiento = 0; asiento < 5; asiento++) {
                    System.out.print("| " + teatro[fila][asiento] + " ");
                }
                System.out.println("|");
            }

            for (int asiento = 0; asiento < 5; asiento++) {
                System.out.print("+---");
            }



            System.out.println("¿Quieres seguir eligiendo asientos? (si/no)");
            String continuar = scanner.next();

            if (continuar.equalsIgnoreCase("no")) {
                exit = true;

            }

        }

        // Imprimimos los asientos finales
        // Imprimir la cuadrícula actualizada
        for (int fila = 0; fila < 5; fila++) {
            for (int asiento = 0; asiento < 5; asiento++) {
                System.out.print("+---");
            }
            System.out.println("+");

            for (int asiento = 0; asiento < 5; asiento++) {
                System.out.print("| " + teatro[fila][asiento] + " ");
            }
            System.out.println("|");
        }

        for (int asiento = 0; asiento < 5; asiento++) {
            System.out.print("+---");
        }
        System.out.println("+");
        System.out.println("¡Gracias por comprar!");




    }
}