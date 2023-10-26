package ejercicioTres;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Declaramos las variables

		double tempMaxSum = 0;
		int dia = 1;

		// Creamos el vector

		double[] temperaturas = new double[7];

		// Creamos el Scanner para ingresar las temperaturas

		Scanner lector = new Scanner(System.in);

		// Creamos el bucle para recorrer el vector

		for (int i = 0; i < temperaturas.length; i++) {
			// Pedimos al usuario que ingrese las temperaturas de cada dia
			System.out.println("Ingrese por favor las temperaturas del dia : " + dia++);
			// Las ingresamos al vector
			temperaturas[i] = lector.nextDouble();
			// Las acumulamos en la varible
			tempMaxSum += temperaturas[i];

		}
		// Imprimimos por consola un mensaje con el valor promedio de todas las
		// temperaturas
		System.out.println("El promedio de todas las temperaturas maximas es de : " + tempMaxSum / temperaturas.length);
	}

}
