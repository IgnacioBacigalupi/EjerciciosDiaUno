package ejercicioUno;

import java.time.LocalDate;
import java.time.Period;

public class Auto extends Vehiculo implements Electrico {
	
	private double capacidadBateria;
	private int autonomia;
	
	
	public Auto(int iD, String placa, String marca, String modelo, int anio, double costo, double capacidadBateria,
			int autonomia) {
		super(iD, placa, marca, modelo, anio, costo);
		this.capacidadBateria = capacidadBateria;
		this.autonomia = autonomia;
	}


	@Override
	public String cargarEnergia() {
		return "Recargar energia";
	}


	@Override
	public String  antiguedadDelVehiculo() {
		LocalDate fechaFabricacion = LocalDate.of(getAnio(), 1, 1);
        LocalDate fechaActual = LocalDate.now();
        Period antiguedad = Period.between(fechaFabricacion, fechaActual);
        return antiguedad.getYears() + " años de antigüedad"; // calcular antiguedad
	}


	@Override
	public String toString() {
		return super.toString() +"\n"+
				"capacidadBateria=" + capacidadBateria + "\n" + "autonomia=" + autonomia  ;
	}
	
	
	

}
