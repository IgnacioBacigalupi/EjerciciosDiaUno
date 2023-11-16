package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascotas<T> {

	private List<Mascota<T>> mascotasRegistradas = new ArrayList<>();

	public void ingresarMascota(int id, String nombre, int edad, T especie) {
		Mascota<T> mascota = new Mascota<>(id, nombre, edad, especie);
		mascotasRegistradas.add(mascota);
	}
	

	public List<Mascota<T>> buscarPorNombre(String nombre) {
		List<Mascota<T>> mascotaPorNombre = new ArrayList<>();
		for (Mascota<T> mascota : mascotasRegistradas) {
			if (mascota.getNombre().equalsIgnoreCase(nombre)) {
				mascotaPorNombre.add(mascota);
			}
		}
		return mascotaPorNombre;
	}

	public List<Mascota<T>> buscarPorEspecie(T especie) {
		List<Mascota<T>> mascotaPorEspecie = new ArrayList<>();
		for (Mascota<T> mascota : mascotasRegistradas) {
			if (mascota.getEspecie().equals(especie)) {
				mascotaPorEspecie.add(mascota);
			}
		}
		return mascotaPorEspecie;
	}

	@SuppressWarnings("unchecked")
	public void generarMascotasAleatorias(int cantidad) {
		Random aleatorio = new Random();
		String[] nombres = { "Buddy", "Luna", "Charlie", "Milo", "Lucy", "Max", "Oliver", "Simba" };
		String[] especies = { "Perro", "Gato", "Reptil", "Ave" };

		for (int i = 0; i < cantidad; i++) {
			 int id = mascotasRegistradas.size() + 1; // Generar un ID único
			String nombre = nombres[aleatorio.nextInt(nombres.length)];
			int edad = aleatorio.nextInt(10) + 1; // Edad entre 1 y 10 años
			String especie = especies[aleatorio.nextInt(especies.length)];

			ingresarMascota(id,nombre, edad,  (T) especie);

		}
	}
	  public int contarMascotasRegistradas() {
	        return mascotasRegistradas.size();
	    }


}