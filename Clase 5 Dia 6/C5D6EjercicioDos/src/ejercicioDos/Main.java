package ejercicioDos;

public class Main {

	public static void main(String[] args) {

		// Creamos el vector vestimentas
		Vestimenta[] vestimentas = new Vestimenta[9];

		vestimentas[0] = new Zapato(1, "zapato1", 250, "Boss", 42, "Marron", "Cuero", "Cordones");
		vestimentas[1] = new Zapato(2, "zapato2", 200, "Dior", 43, "Gris", "Charol", "Hebilla de correa");
		vestimentas[2] = new Zapato(3, "zapato3", 150, "Lacoste", 41, "Negro", "Gamuza", "velcro");
		vestimentas[3] = new Pantalon(4, "Pantalon4", 154, "Levis", 38, "jean", "Slim", "Lino");
		vestimentas[4] = new Pantalon(5, "Pantalon5", 80, "H&M", 36, "Verde", "Ancho", "Algodon");
		vestimentas[5] = new Pantalon(6, "Pantalon6", 75, "Columbia", 34, "Negro", "Campana", "Lana");
		vestimentas[6] = new Camiseta(7, "Camiseta7", 15, "Nike", 8, "Blaca", "Corta", "En V");
		vestimentas[7] = new Camiseta(8, "Camiseta8", 10, "Adidas", 6, "Negra", "Larga", "Redondo");
		vestimentas[8] = new Sombrero(9, "Sombrero9", 1000, "La Galera", 4, "Negro", "Galera", "Grande");
		// Lo recorremos y ejecutamos el metodo correspondiente a cada objeto
		for (int i = 0; i < vestimentas.length; i++) {

			vestimentas[i].mostrar();
		}
	}

}
