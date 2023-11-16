package ejercicio1;

public class MainConcesionaria {

	public static void main(String[] args) {

		InventarioCoches<Coche> inventarioCoches = new InventarioCoches<>();

		inventarioCoches.agregarCoche(new Coche("Ford", "Mustang", 1965, 6000.23));
		inventarioCoches.agregarCoche(new Coche("Toyota", "Camry", 2023, 25000.0));
		inventarioCoches.agregarCoche(new Coche("Honda", "Accord", 2023, 26000.0));
		inventarioCoches.agregarCoche(new Coche("Ford", "Fusion", 2020, 27000.0));
		inventarioCoches.agregarCoche(new Coche("Chevrolet", "Malibu", 2023, 28000.0));
		inventarioCoches.agregarCoche(new Coche("Nissan", "Altima", 2002, 29000.0));
		inventarioCoches.agregarCoche(new Coche("Toyota", "Corolla", 2023, 30000.0));
		inventarioCoches.agregarCoche(new Coche("Honda", "Civic", 2014, 31000.0));
		inventarioCoches.agregarCoche(new Coche("Ford", "Escape", 2023, 32000.0));
		inventarioCoches.agregarCoche(new Coche("Chevrolet", "Equinox", 2022, 33000.0));
		inventarioCoches.agregarCoche(new Coche("Nissan", "Rogue", 2023, 34000.0));
		System.out.println("----------------------");
		// Buscamos los coches por marca
		inventarioCoches.buscarCochePorMarca("Ford");
		System.out.println("----------------------");
		inventarioCoches.buscarCochePorMarca("Toyota");
		System.out.println("----------------------");
		inventarioCoches.buscarCochePorMarca("Honda");
		System.out.println("----------------------");
		inventarioCoches.buscarCochePorMarca("Nissan");
		System.out.println("----------------------");
		// Ingresamos una marca que no hay para verificar que el codigo funciona
		inventarioCoches.buscarCochePorMarca("Peugeot");
		System.out.println("----------------------");
		System.out.println("-/-/-/--------------/-/-/");
		// Buscamos los coches por anio
		inventarioCoches.buscarCochesPorAnio(1965);
		System.out.println("----------------------");
		inventarioCoches.buscarCochesPorAnio(2002);
		System.out.println("----------------------");
		inventarioCoches.buscarCochesPorAnio(2014);
		System.out.println("----------------------");
		inventarioCoches.buscarCochesPorAnio(2020);
		System.out.println("----------------------");
		inventarioCoches.buscarCochesPorAnio(2022);
		System.out.println("----------------------");
		inventarioCoches.buscarCochesPorAnio(2023);
		System.out.println("----------------------");
		// Ingresamos un anio que no hay para verificar que el codigo funciona
		inventarioCoches.buscarCochesPorAnio(2000);
		//Calculamos el valor total de todos los coches
		inventarioCoches.calcularValorTotal();
		
	}

}
