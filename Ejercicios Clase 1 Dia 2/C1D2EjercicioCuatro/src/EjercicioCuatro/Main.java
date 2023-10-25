package EjercicioCuatro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Declaracion de variables
				int num1, num2, res1, res2, res3, res4;

				// Habilitar la entrada de datos pot teclado

				Scanner scanner = new Scanner(System.in);

				// Preguntar al usuarui y asignar valores

				System.out.println("Por favor ingrese un numero enero ");

				num1 = scanner.nextInt();
				System.out.println("Por favor ingrese otro numero enero ");
				num2 = scanner.nextInt();

				// CALCULOS
				res1 = num1 + num2;
				res2 = num1 - num2;
				res3 = num1 * num2;
				res4 = num1 / num2;

				// MOSTRAR RESULTADOS
				System.out.println("La suma es: " + res1);
				System.out.println("La resta es: " + res2);
				System.out.println("La multiplicacion es: " + res3);
				System.out.println("La división es: " + res4);

				System.out.println();

			}

	}


