package claseCincoDiaSeis;

public class Ave extends Animal {
	// Agregamos los atributos propios de la clase "Ave"
	private double envergaduraDeAlas;
	private String tipoDeVuelo;
	private String colorPlumaje;
	private String tipoDePico;
	// Creamos el constructor con los atributos tanto de Animal como de Ave (Ave
	// extends Aminal)

	public Ave(int iD, String nombre, String tipoDePiel, String tipoAlimentacion, double envergaduraDeAlas,
			String tipoDeVuelo, String colorPlumaje, String tipoDePico) {
		super(iD, nombre, tipoDePiel, tipoAlimentacion);
		this.envergaduraDeAlas = envergaduraDeAlas;
		this.tipoDeVuelo = tipoDeVuelo;
		this.colorPlumaje = colorPlumaje;
		this.tipoDePico = tipoDePico;
	}

	// Sobreescribimos el metodo saludar
	@Override
	public void saludar() {
		System.out.println("Hola, soy un ave");
	}

}
