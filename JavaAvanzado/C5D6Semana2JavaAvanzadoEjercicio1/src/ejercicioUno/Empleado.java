/*Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente"). Implementa las siguientes operaciones utilizando Streams y Optionals:

Filtra los empleados cuyo salario sea mayor a cierto valor específico.

Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.

Encuentra al empleado con el salario más alto utilizando Optionals.*/


package ejercicioUno;

public class Empleado {
	private String nombre;
	private Double salario;
	private String  categoria;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Empleado(String nombre, Double salario, String categoria) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return " [nombre=" + nombre + ", salario=" + salario + ", categoria=" + categoria + "]" + '\n' ;
	}
	
	
	
	

}
