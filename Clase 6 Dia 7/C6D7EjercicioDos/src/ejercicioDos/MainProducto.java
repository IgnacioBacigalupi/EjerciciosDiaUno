package ejercicioDos;

import java.util.ArrayList;
import java.util.List;

public class MainProducto {

	public static void main(String[] args) {
		// Creamos el ArrayList de la clase Producto

		List<Producto> listaProductos = new ArrayList<>();

		listaProductos.add(new Cafetera(1, "Cafetera", "Cafelin", "Capsulas", 35.25, 75, 80));
		listaProductos.add(new Cascos(2, "Cascos", "Sony", "Bluetooth", 15.65, 35, 200));
		listaProductos.add(new Horno(3, "Horno", "Kata", "Horno electrico", 45.48, 120, 10));
		listaProductos.add(new Laptop(4, "Laptop", "Lenovo", "UltraBoook", 450.65, 1500, 62));
		listaProductos.add(new Microondas(5, "Microondas", "Bosch", "Encimera", 35.47, 90, 3));
		listaProductos.add(new Plancha(6, "Plancha", "Liliana", "Hierro fundido", 25.48, 60, 200));
		listaProductos.add(new Radio(7, "Radio", "Pilhips", "Derpertador", 5.48, 20, 76));
		listaProductos.add(new Telefono(8, "Telefono", "Sanyo", "inalambrico", 36.95, 50, 28));
		listaProductos.add(new Tostadora(9, "Tostadora", "Breville", "Doble Ranura", 20.78, 63, 485));
		listaProductos.add(new VitroCeramica(10, "Vitro", "Savoid", "Induccion", 250.84, 500, 158));
		
		
		//  Encontrar el producto con el mayor precio de venta
        Producto productoMayorPrecioVenta = encontrarProductoMayorPrecioVenta(listaProductos);
        System.out.println("Producto con mayor precio de venta: " + productoMayorPrecioVenta.getNombre());

        //  Encontrar el producto con el menor precio de costo
        Producto productoMenorPrecioCosto = encontrarProductoMenorPrecioCosto(listaProductos);
        System.out.println("Producto con menor precio de costo: " + productoMenorPrecioCosto.getNombre());

        //  Borrar el producto en la posición 5 de la lista
        listaProductos.remove(5);

        //  Encontrar el producto con la mayor cantidad en stock y actualizar el stock
        Producto productoMayorStock = encontrarProductoMayorStock(listaProductos);
        System.out.println("Producto con mayor cantidad en stock: " + productoMayorStock.getNombre());
        descontarStock(productoMayorStock, 3);

        //  Mostrar un mensaje informativo
        System.out.println("Operaciones realizadas con exito.");
    }

    public static Producto encontrarProductoMayorPrecioVenta(List<Producto> listaProductos) {
        Producto productoMayorPrecioVenta = null;
        double precioMax = Double.NEGATIVE_INFINITY;

        for (Producto producto : listaProductos) {
            if (producto.getPrecioVenta() > precioMax) {
                precioMax = producto.getPrecioVenta();
                productoMayorPrecioVenta = producto;
            }
        }

        return productoMayorPrecioVenta;
    }

    public static Producto encontrarProductoMenorPrecioCosto(List<Producto> listaProductos) {
        Producto productoMenorPrecioCosto = null;
        double precioMin = Double.POSITIVE_INFINITY;

        for (Producto producto : listaProductos) {
            if (producto.getPrecioCosto() < precioMin) {
                precioMin = producto.getPrecioCosto();
                productoMenorPrecioCosto = producto;
            }
        }

        return productoMenorPrecioCosto;
    }

    
    

    public static Producto encontrarProductoMayorStock(List<Producto> listaProductos) {
        Producto productoMayorStock = null;
        int stockMax = Integer.MIN_VALUE;

        for (Producto producto : listaProductos) {
            if (producto.getStock() > stockMax) {
                stockMax = producto.getStock();
                productoMayorStock = producto;
            }
        }

        return productoMayorStock;
    }

    public static void descontarStock(Producto producto, int cantidad) {
        producto.setStock(producto.getStock() - cantidad);
    }
}
	