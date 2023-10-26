package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Declaramos la varible edad

		int edad = 0;
		// Creamos el Scanner para poder ingresar los datos
		Scanner lector = new Scanner(System.in);
		// Se le pide al usuario que ingrese su edad
		System.out.println("Por favor ingrese su edad.");
		// Asignamos el valor ingresado por consola a edad

		edad = lector.nextInt();

		// Creamos la estructura condicional para evaluar la viariable edad

		if (edad < 18) {

			System.out.println("No puede ingresar.");
		} else if (edad >= 18) {
			System.out.println("Puede ingresar.");

		}
	}

}
