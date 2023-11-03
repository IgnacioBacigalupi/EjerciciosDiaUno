package claseCincoDiaSeis;

public class Reptil extends Animal {
	// Agregamos los atributos propios de la clase "Reptil"
	private double longitud;
	private String tipoDeEscama;
	private String tipoDeVeneno;
	private String habitat;

	// Creamos el constructor con los atributos tanto de Animal como de Reptil
	// (Reptil extends Aminal)
	public Reptil(int iD, String nombre, String tipoDePiel, String tipoAlimentacion, double longitud,
			String tipoDeEscama, String tipoDeVeneno, String habitat) {
		super(iD, nombre, tipoDePiel, tipoAlimentacion);
		this.longitud = longitud;
		this.tipoDeEscama = tipoDeEscama;
		this.tipoDeVeneno = tipoDeVeneno;
		this.habitat = habitat;
	}

	// Sobreescribimos el metodo saludar
	@Override
	public void saludar() {
		System.out.println("Hola , soy un reptil");
	}
}
