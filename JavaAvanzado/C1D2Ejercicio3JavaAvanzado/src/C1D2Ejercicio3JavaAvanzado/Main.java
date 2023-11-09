package C1D2Ejercicio3JavaAvanzado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Declaramos el vector
		Scanner lector = new Scanner(System.in);
		System.out.println("ingrese el valor (0 = terminar)");
		int valor;
		int[] vector = new int[5];

		valor = lector.nextInt();
		while (valor != 0) {

			System.out.println("ingrese posicion del valor");
			int posc = lector.nextInt();
			try {
				vector[posc] = valor;
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posicion Invalida");
			}
			
			System.out.println("ingrese el valor (0 = terminar)");
			valor = lector.nextInt();
			
			
		}
	}

}
