package ejercicioUno;

public class MainElectrodomesticos {

	public static void main(String[] args) {

		// Creamos tres instancias de la clase Electrodomesticos utilizando parametros
		Electrodomestico electrodomestico1 = new Electrodomestico(125, "Liliana", "ultra 3000", "E", "Verde");
		Electrodomestico electrodomestico2 = new Electrodomestico(254, "Bosch", "schp-300", "A", "Rojo");
		Electrodomestico electrodomestico3 = new Electrodomestico(221, "Kata", "gdre23", "F", "Azul");

		Electrodomestico electrodomestico4 = new Electrodomestico();

		System.err.println("La marca de electrodomestico 1 es : " + electrodomestico1.getMarca() + " , el modelo : "
				+ electrodomestico1.getModelo() + "y su color: " + electrodomestico1.getColor());
		System.err.println("La marca de electrodomestico 2 es : " + electrodomestico2.getMarca() + " , el modelo : "
				+ electrodomestico2.getModelo() + "y su color: " + electrodomestico2.getColor());
		System.err.println("La marca de electrodomestico 3 es : " + electrodomestico3.getMarca() + " , el modelo : "
				+ electrodomestico3.getModelo() + "y su color: " + electrodomestico3.getColor());

		System.err.println("La marca de electrodomestico 4 es : " + electrodomestico4.getMarca() + " , el modelo : "
				+ electrodomestico4.getModelo() + "y su color: " + electrodomestico4.getColor());
		
		//Al pedir los valores del electrodomestico4 si se obtiene un valor pero que es null ya que no tiene ningun parametro asignado en su constructor.

	}

}
