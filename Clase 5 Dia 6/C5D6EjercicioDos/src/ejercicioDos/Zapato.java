package ejercicioDos;

public class Zapato extends Vestimenta {
	// Creamos los atributos propios de la clase zapato
	private String material;
	private String tipoCierre;

	// Generamos sus constructores
	public Zapato(int codigo, String nombre, int precio, String marca, int talla, String color, String material,
			String tipoCierre) {
		super(codigo, nombre, precio, marca, talla, color);
		this.material = material;
		this.tipoCierre = tipoCierre;
	}

	// Sobreescbribimos el metodo mostrar de la clase Vestimenta
	@Override
	public void mostrar() {
		System.out.println("Estos zapatos  son marca :  " + getMarca());
	}

}
