package ejercicioDos;

public class Camiseta extends Vestimenta {
	// Creamos los atributos propios de la clase Camiseta
	private String manga;

	private String cuello;

	// Generamos sus constructores
	public Camiseta(int codigo, String nombre, int precio, String marca, int talla, String color, String manga,
			String cuello) {
		super(codigo, nombre, precio, marca, talla, color);
		this.manga = manga;
		this.cuello = cuello;
	}

	// Sobreescbribimos el metodo mostrar de la clase Vestimenta
	@Override
	public void mostrar() {
		System.out.println("Esta camiseta marca " + getMarca() + " es manga :" + this.manga);
	}

}
