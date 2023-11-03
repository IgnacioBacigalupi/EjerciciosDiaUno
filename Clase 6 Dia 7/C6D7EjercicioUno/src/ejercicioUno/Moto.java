package ejercicioUno;

import java.time.LocalDate;
import java.time.Period;

public class Moto extends Vehiculo implements Combustion	 {
	
	private int cilindrada;
	private String tipoMotor;
	public Moto(int iD, String placa, String marca, String modelo, int anio, double costo, int cilindrada,
			String tipoMotor) {
		super(iD, placa, marca, modelo, anio, costo);
		this.cilindrada = cilindrada;
		this.tipoMotor = tipoMotor;
	}
	@Override
	public String recargarCombustible() {
		return "Recargando energia";
	}
	@Override
	public String  antiguedadDelVehiculo() {
		LocalDate fechaFabricacion = LocalDate.of(getAnio(), 1, 1);
        LocalDate fechaActual = LocalDate.now();
        Period antiguedad = Period.between(fechaFabricacion, fechaActual);
        return antiguedad.getYears() + " años de antigüedad"; // 
	}
	
	
	
	

}
