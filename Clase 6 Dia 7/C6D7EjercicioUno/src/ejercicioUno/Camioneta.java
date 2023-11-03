package ejercicioUno;

import java.time.LocalDate;
import java.time.Period;

public class Camioneta  extends Vehiculo implements Combustion{
	
	private int capacidadTanque;
	private double comsumoCombustible;
	
	
	public Camioneta(int iD, String placa, String marca, String modelo, int anio, double costo, int capacidadTanque,
			double comsumoCombustible) {
		super(iD, placa, marca, modelo, anio, costo);
		this.capacidadTanque = capacidadTanque;
		this.comsumoCombustible = comsumoCombustible;
	}


	@Override
	public String recargarCombustible() {
		
		return "Recargando combustible";
	}


	@Override
	public String  antiguedadDelVehiculo() {
		LocalDate fechaFabricacion = LocalDate.of(getAnio(), 1, 1);
        LocalDate fechaActual = LocalDate.now();
        Period antiguedad = Period.between(fechaFabricacion, fechaActual);
        return antiguedad.getYears() + " años de antigüedad"; // calcul
	}
	
	

}
