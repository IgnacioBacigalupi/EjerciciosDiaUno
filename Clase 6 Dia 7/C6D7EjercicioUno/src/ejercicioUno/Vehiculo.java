package ejercicioUno;

public abstract class Vehiculo {
	private int iD;
	private String placa;
	private String marca;
	private String modelo;
	private int anio;
	private double costo;

	public Vehiculo(int iD, String placa, String marca, String modelo, int anio, double costo) {
		super();
		this.iD = iD;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.costo = costo;
	}
	

	public int getAnio() {
		return anio;
	}



	public abstract String antiguedadDelVehiculo();

	
	
	@Override
    public String toString() {
        return  "Matricula:" + placa + "\n"+
                "Marca: " + marca +"\n" +
                "Modelo: " + modelo + "\n" +
                "Fecha de fabricacion: " + anio + "\n" +
                antiguedadDelVehiculo()+ "\n" +
                "Precio: " + costo +" €" ;
    }
}
