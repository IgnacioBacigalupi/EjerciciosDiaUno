/*Imagina que estás construyendo una aplicación para gestionar eventos en una agenda. Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller"). Implementa las siguientes operaciones utilizando Streams y Optionals:

Filtra los eventos que están programados para una fecha específica.

Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.

Encuentra el evento más próximo en el tiempo utilizando Optionals.*/

package ejercicioDos;

import java.time.LocalDate;


public class Eventos {
	private String nombre;
	private LocalDate fecha;
	private String categoria;
	
	public Eventos(String nombre, LocalDate fecha, String categoria) {
		
		this.nombre = nombre;
		this.fecha = fecha;
		this.categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Nombre: " + nombre + '\n'+ 
				"Fecha: " + fecha + '\n' +
				"Categoria: " + categoria + '\n' ;
	}
	
	
	

}
