package org.example.logica;

import javax.persistence.*;

@Entity
public class Platillo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nombre;
    private String receta;
    private double precio;

    public Platillo() {
    }

    public Platillo(Long id, String nombre, String receta, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.receta = receta;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
