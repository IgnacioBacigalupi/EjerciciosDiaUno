package ejercicioDos;

public class MainPersona {

	public static void main(String[] args) {
		// Creamos el vector
		Persona[] personas = new Persona[5];

		// Completamos el vector creando 5 objetos persona
		personas[0] = new Persona(1, "Carlos", 15, "Serrano 44", 352145254);
		personas[1] = new Persona(1, "Cesar", 25, "Peralta 45", 456123987);
		personas[2] = new Persona(1, "Camilo", 96, "Lima 96", 147852369);
		personas[3] = new Persona(1, "Constantino", 78, "Callao 75", 546879321);
		personas[4] = new Persona(1, "Carmelo", 36, "Vid 44", 753159456);

		for (int i = 0; i < personas.length; i++) {

			System.out.println(personas[i].getNombre() + " tiene : " + personas[i].getEdad() + " anios.");

		}
		System.out.println("-----------------------------------");
		// Mostramos los datos de la persona en la posicion 1 y 2 antes del cambio

		System.out.println("La persona 1 es " + personas[1].getNombre());
		System.out.println("La persona 2 es " + personas[2].getNombre());
		// Cambiamos el nombre de la persona en la posicion 1 y 2

		personas[1].setNombre("Ramiro");
		personas[2].setNombre("Alberto");
		System.out.println("-----------------------------------");
		// Mostramos el cambio en los nombres de las personas en la posicion 1 y 2

		System.out.println("La persona 1 es " + personas[1].getNombre() + " tiene " + personas[1].getEdad()
				+ " anios , vive en  la calle:" + personas[1].getDireccion() + " y su telefono es :"
				+ personas[1].getNumTel());
		System.out.println("La persona 1 es " + personas[2].getNombre() + " tiene " + personas[2].getEdad()
				+ " anios , vive en  la calle:" + personas[2].getDireccion() + " y su telefono es :"
				+ personas[2].getNumTel());
		System.out.println("-----------------------------------------------------");
		// Recorremos el vector y mostramos los datos de las personas con mas de 30
		// anios

		for (int i = 0; i < personas.length; i++) {
			if(personas[i].getEdad()>30) {
				System.out.println("La persona  es " + personas[i].getNombre() + " tiene " + personas[i].getEdad()
						+ " anios , vive en  la calle:" + personas[i].getDireccion() + " y su telefono es :"
						+ personas[i].getNumTel());
			}
		}

	}

}
