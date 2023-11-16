/*Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. Crea una clase Auto con atributos como marca, modelo, año, y precio. Implementa una clase utilitaria InventarioAutos con métodos genéricos para realizar las siguientes operaciones:

Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.

Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.

Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos los autos en el inventario.*/
package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class InventarioCoches<T extends Coche> {

	private List<T> coches;

	public InventarioCoches() {
		this.coches = new ArrayList<>();
	}

	public void agregarCoche(T coche) {
		coches.add(coche);
		System.out.println("El coche modelo: " + coche.getModelo() + ", marca: " + coche.getMarca()
				+ " fue agregado al inventario.");
	}

	public List<T> buscarCochePorMarca(String marca) {
		List<T> cochesEncontrados = new ArrayList<>();
		for (T coche : coches) {
			if (marca.equalsIgnoreCase(coche.getMarca())) {
				cochesEncontrados.add(coche);
			}
		}
		if (cochesEncontrados.isEmpty()) {
			System.out.println("No se encontraron coches de la marca: " + marca);
		} else {
			System.out.println("Coches encontrados de la marca: " + marca);
			for (T coche : cochesEncontrados) {
				System.out.println(coche);
			}
		}

		return cochesEncontrados;
	}

	public List<T> buscarCochesPorAnio(int anio) {
		List<T> cochesPorAnio = new ArrayList<>();
		for (T coche : coches) {
			if (anio == coche.getAnio()) {
				cochesPorAnio.add(coche);
			}
		}

		if (cochesPorAnio.isEmpty()) {
			System.out.println("No se encontraron coches del anio " + anio);
		} else {
			System.out.println("Coches encontrados del anio " + anio + ":");
			for (T coche : cochesPorAnio) {
				System.out.println(coche);
			}
		}

		return cochesPorAnio;
	}

	public double calcularValorTotal() {
		double valorTotal = 0.0;
		for (T coche : coches) {
			valorTotal += coche.getPrecio();
		}
		System.out.println("El valor total del inventario es: $" + valorTotal);
		return valorTotal;
	}

	public List<T> getCoches() {
		return coches;
	}

	public void setCoches(List<T> coches) {
		this.coches = coches;
	}
}