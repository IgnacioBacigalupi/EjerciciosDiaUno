package ejercicioDos;

public class Producto {
	// Atributos de clase
	private int codigo;
	private String nombre;
	private String marca;
	private String tipo;
	private double precioCosto;
	private double precioVenta;
	private int stock;

	// Constructores
	public Producto(int codigo, String nombre, String marca, String tipo, double precioCosto, double precioVenta,
			int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.tipo = tipo;
		this.precioCosto = precioCosto;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	// Getters y Setters
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecioCosto() {
		return precioCosto;
	}

	public void setPrecioCosto(double precioCosto) {
		this.precioCosto = precioCosto;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
