package ejercicioDos;

public class Persona {
	// Creamos los atributos de clase
	private int id;
	private String nombre;
	private int edad;
	private String direccion;
	private int numTel;
	// Creamos los constructores

	public Persona(int id, String nombre, int edad, String direccion, int numTel) {

		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.numTel = numTel;
	}

	// Creamos los Getters Y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumTel() {
		return numTel;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

}
