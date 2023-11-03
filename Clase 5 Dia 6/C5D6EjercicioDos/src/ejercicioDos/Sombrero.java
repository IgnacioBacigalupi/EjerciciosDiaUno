package ejercicioDos;

public class Sombrero extends Vestimenta {
	// Creamos los atributos propios de la clase Sombrero
	private String tipo;

	private String tamanio;

	// Generamos sus constructores
	public Sombrero(int codigo, String nombre, int precio, String marca, int talla, String color, String tipo,
			String tamanio) {
		super(codigo, nombre, precio, marca, talla, color);
		this.tipo = tipo;
		this.tamanio = tamanio;
	}

	// Sobreescbribimos el metodo mostrar de la clase Vestimenta
	@Override
	public void mostrar() {

		System.out.println("Este sombrero marca : " + getMarca() + " es de tipo : " + this.tipo);

	}
}
