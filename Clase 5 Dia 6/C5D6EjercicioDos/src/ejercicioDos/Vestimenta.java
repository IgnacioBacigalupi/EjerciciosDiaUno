package ejercicioDos;

public class Vestimenta {

	// Creamos los atributos de clase
	private int codigo;
	private String nombre;
	private int precio;
	private String marca;
	private int talla;
	private String color;

	// Cramos los construcctores
	public Vestimenta(int codigo, String nombre, int precio, String marca, int talla, String color) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
		this.talla = talla;
		this.color = color;
	}

	// Creamos los getters y setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Cremos el metodo mostrar
	public void mostrar() {
		System.out.println("Esta prenda es de marca  " + marca);

	}

}
