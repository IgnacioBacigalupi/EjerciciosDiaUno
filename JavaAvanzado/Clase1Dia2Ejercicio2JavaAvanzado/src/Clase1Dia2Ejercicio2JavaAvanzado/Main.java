package Clase1Dia2Ejercicio2JavaAvanzado;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String nombre;
		double precio;
		int cantidad;

		// Comprobación de entrada válida para el nombre
		while (true) {
			System.out.println("Introduzca el nombre del producto");

			nombre = lector.nextLine();

			if (!nombre.trim().isEmpty()) {
				break;
			} else {
				System.out.println("Error: El nombre no puede ser solo un espacio en blanco.");
			}
		}

		// Comprobación de entrada válida para el precio
		while (true) {
			System.out.println("Introduzca el precio");

			if (lector.hasNextDouble()) {
				precio = lector.nextDouble();
				break;
			} else {
				System.out.println("Error: Introduzca un número válido para el precio.");
				lector.next(); // Limpiar el buffer del escáner
			}
		}

		// Comprobación de entrada válida para la cantidad
		while (true) {
			System.out.println("Introduzca la cantidad de stock");

			if (lector.hasNextInt()) {
				cantidad = lector.nextInt();
				break;
			} else {
				System.out.println("Error: Introduzca un número entero válido para la cantidad.");
				lector.next(); // Limpiar el buffer del escáner
			}
		}

		try {
			Producto producto = new Producto();
			producto.agregarProducto(nombre, precio, cantidad);

			//mostramos el producto almacenado en la lista
			
			List<Producto> listaProductos = Producto.getProductos();
			for (Producto p : listaProductos) {
				System.out.println(p.toString());
			}
		} catch (InventarioException e) {
			System.out.println(e.getMessage());
		}
	}
}