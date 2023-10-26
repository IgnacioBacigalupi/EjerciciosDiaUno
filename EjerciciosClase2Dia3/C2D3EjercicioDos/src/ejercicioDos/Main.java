package ejercicioDos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 // Declaramos variables
        double precioCompra = 0;
        double precioProducto;
        
        //Creamos el  Scanner para ingresar los valores
        Scanner lector = new Scanner(System.in);

        // Pedimos al cajero que ingrese los precios de los productos y le indicamos cómo finalizar la operación
        System.out.println("Ingrese los precios de los productos. Para finalizar, ingrese un numero negativo o 0.");

        while (true) {
            System.out.print("Precio del producto: ");
            precioProducto = lector.nextDouble();

            if (precioProducto <= 0) {
                break;
            }
            //Acumulamos el precio de los productos
            precioCompra += precioProducto;
        }

        System.out.println("Total de compra es : " + precioCompra);
    }

}