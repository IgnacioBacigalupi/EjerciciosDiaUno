package Clase1Dia2.Clase1Dia2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Refranes {
    private List<String> refranes;

    // Constructor de la clase Refranes
    public Refranes() {
        refranes = new ArrayList<>();
        cargarRefranes();
    }

    // Método para cargar los refranes en la lista
    private void cargarRefranes() {
        refranes.add("El pájaro no vuela porque tiene alas, sino porque tiene el corazón ligero");
        refranes.add("El hombre sabio no dice lo que sabe, y el hombre necio no sabe lo que dice");
        refranes.add("Antes de buscar la paz exterior, busca la paz interior");
        refranes.add("No hay árbol que el viento no haya sacudido");
        refranes.add("El pez descubre el agua tarde");
        refranes.add("El tiempo y el agua son buenos maestros, ya que ambos dan forma a todo");
        refranes.add("Si caminas solo, llegarás más rápido; si caminas acompañado, llegarás más lejos");
        refranes.add("La tortuga se mueve solo cuando lleva su casa consigo");
        refranes.add("El sabio adapta su mente a la situación, el necio insiste en que la situación se adapte a él");
        refranes.add("No hay árbol que el viento no haya sacudido");
    }

    // Método para obtener un refrán aleatorio
    public String obtenerRefranAleatorio() {
        Random rand = new Random();
        int indiceAleatorio = rand.nextInt(refranes.size());
        return refranes.get(indiceAleatorio);
    }
}
