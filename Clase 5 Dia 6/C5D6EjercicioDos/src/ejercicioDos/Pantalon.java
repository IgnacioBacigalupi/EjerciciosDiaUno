package ejercicioDos;

public class Pantalon extends Vestimenta {
	// Creamos los atributos propios de la clase Pantalon
	private String estilo;

	private String tipoTejido;

	// Generamos sus constructores
	public Pantalon(int codigo, String nombre, int precio, String marca, int talla, String color, String estilo,
			String tipoTejido) {
		super(codigo, nombre, precio, marca, talla, color);
		this.estilo = estilo;
		this.tipoTejido = tipoTejido;
	}

	// Sobreescbribimos el metodo mostrar de la clase Vestimenta
	@Override
	public void mostrar() {
		System.out.println("Estos pantalones marca : " + getMarca() + "  tienen un estilo " + this.estilo);
	}

}
