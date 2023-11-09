package Clase1Dia2Ejercicio2JavaAvanzado;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private static List<Producto> productos = new ArrayList<>();

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public static List<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(String nombre, double precio, int cantidad) throws InventarioException {
        validarNombre(nombre);
        validarPrecio(precio);
        validarCantidad(cantidad);

        Producto nuevoProducto = new Producto(nombre, precio, cantidad);
        productos.add(nuevoProducto);

        System.out.println("Producto \"" + nuevoProducto.getNombre() + "\" almacenado con precio " + nuevoProducto.getPrecio() + " y cantidad " + nuevoProducto.getCantidad() + ".");
    }

    private void validarNombre(String nombre) throws InventarioException {
        if (nombre.isEmpty()) {
            throw new InventarioException("Error: Nombre vacío");
        }
    }

    private void validarPrecio(double precio) throws InventarioException {
        if (precio <= 0) {
            throw new InventarioException("Error: El precio es 0 o menor");
        }
    }

    private void validarCantidad(int cantidad) throws InventarioException {
        if (cantidad <= 0) {
            throw new InventarioException("Error: La cantidad es 0 o menor");
        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}