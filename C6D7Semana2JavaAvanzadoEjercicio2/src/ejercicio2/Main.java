package ejercicio2;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		 RegistroMascotas registro = new RegistroMascotas();

	        // Agregar mascotas manualmente
	        registro.ingresarMascota(1,"Toby", 3, "Perro");
	        registro.ingresarMascota(2,"Felipe", 8, "Gato");
	        registro.ingresarMascota(3,"Federico", 11, "Reptil");

	        // Buscar mascotas por nombre
	        List<Mascota<?>> mascotasPorNombre = registro.buscarPorNombre("Federico");
	        System.out.println("Mascotas por nombre: " + mascotasPorNombre);

	        // Buscar mascotas por especie
	        List<Mascota<?>> mascotasPorEspecie = registro.buscarPorEspecie("Gato");
	        System.out.println("Mascotas por especie: " + mascotasPorEspecie);

	         //Contar mascotas registradas
	        int cantidadMascotas = registro.contarMascotasRegistradas();
	        System.out.println("Cantidad total de mascotas registradas: " + cantidadMascotas);

	        // Generar datos aleatorios
	        registro.generarMascotasAleatorias(2);
	        System.out.println("Mascotas despues de generar datos aleatorios: " + registro.buscarPorEspecie("Perro"));
	}
					
}
