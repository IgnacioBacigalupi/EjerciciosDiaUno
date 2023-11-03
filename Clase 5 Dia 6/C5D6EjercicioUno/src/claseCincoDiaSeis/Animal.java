package claseCincoDiaSeis;

public class Animal {
	// Declaramos los atributos de la clase Animal
	private int iD;
	private String nombre;
	private String tipoDePiel;
	private String tipoAlimentacion;

	// Declaramos sus constructores
	public Animal(int iD, String nombre, String tipoDePiel, String tipoAlimentacion) {
		super();
		this.iD = iD;
		this.nombre = nombre;
		this.tipoDePiel = tipoDePiel;
		this.tipoAlimentacion = tipoAlimentacion;
	}

	// Creamos el metodo "saludar"
	public void saludar() {
		System.out.println("Hola,soy un animal");
	}
		// Creamos el metodo "saludar" como privado
		/*private void saludar() {
			System.out.println("Hola,soy un animal");
			
		
	
	}*/

	// Declaramos Getters y Setters
	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoDePiel() {
		return tipoDePiel;
	}

	public void setTipoDePiel(String tipoDePiel) {
		this.tipoDePiel = tipoDePiel;
	}

	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}

}
