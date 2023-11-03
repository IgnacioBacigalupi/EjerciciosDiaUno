package claseCincoDiaSeis;

public class Main {

	public static void main(String[] args) {
		// Creamos los objetos a partir de las clases Mamifero , Ave y Reptil
		Mamifero mamifero = new Mamifero(1, "Mono", "peludo", "Carnivoro", 2, "Viviparo", "negro", "Selva");

		Ave ave = new Ave(2, "Paloma", "Plumas", "Carnivora", 2.0, "Ala batiente", "Gris", "Conico");

		Reptil reptil = new Reptil(3, "Serpiente", "Escamas", "Carnivoro", 3.25, "Constrictoras", "Veneno neurotóxico",
				"Selva");

		// LLmamamos al metodo saludar de cada objeto

		mamifero.saludar();
		ave.saludar();
		reptil.saludar();

		// Intentar asignar un objeto Mamifero a una referencia de tipo Animal
		Animal animal = mamifero;

		animal.saludar();// Llama al método saludar de Mamifero

		// Esto es posible gracias a la propiedad de la herencia , ya que Mamifero es una
		// subclase de Animal
   
		// Cambiar el modificador de acceso de los metodos de "public" a "Private". 
		//No puede hacerse ya que si ponemos los metodos como privados no pueden ser accedidos desde fuera de la clase y la clase Main da error.
	}
       
}
