package claseCincoDiaSeis;

public class Mamifero extends Animal {
	// Agregamos los atributos propios de la clase "Mamifero"
	private int numPatas;
	private String tipoReproduccion;
	private String color;
	private String habitat;

	// Creamos el constructor con los atributos tanto de Animal como de Mamifero
	// (Mamifero extends Aminal)

	public Mamifero(int iD, String nombre, String tipoDePiel, String tipoAlimentacion, int numPatas,
			String tipoReproduccion, String color, String habitat) {
		super(iD, nombre, tipoDePiel, tipoAlimentacion);
		this.numPatas = numPatas;
		this.tipoReproduccion = tipoReproduccion;
		this.color = color;
		this.habitat = habitat;
	}

	// Sobreescribimos el metodo saludar
	@Override
	public void saludar() {
		System.out.println("Hola , soy un mamifero");
	}

}
