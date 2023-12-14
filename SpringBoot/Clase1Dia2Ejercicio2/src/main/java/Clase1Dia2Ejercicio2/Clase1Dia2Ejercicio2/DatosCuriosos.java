package Clase1Dia2Ejercicio2.Clase1Dia2Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DatosCuriosos {
    private List<String> datosCuriosos;
    public DatosCuriosos () {
        datosCuriosos = new ArrayList<>();
        cargarDatos();
    }

    // Método para cargar los refranes en la lista
    private void cargarDatos() {
        datosCuriosos.add("En el continente recientemente descubierto, América, se han encontrado frutos y animales nunca antes vistos en Europa.");
        datosCuriosos.add("Se dice que en tierras lejanas, hay seres con cuerpos mitad hombre y mitad pez llamados 'sirenas'.");
        datosCuriosos.add("Los marineros cuentan historias de enormes criaturas marinas, tales como el 'kraken', que se dice que pueden hundir barcos con sus tentáculos gigantes.");
        datosCuriosos.add("Se ha hallado en Asia un juego estratégico llamado 'chaturanga', que se dice que es el antecesor del ajedrez.");
        datosCuriosos.add("En las crónicas se habla de una planta exótica y aromática llamada 'canela' que se comercia a gran precio en tierras orientales.");
        datosCuriosos.add("Los exploradores relatan avistamientos de extrañas criaturas con cuernos en sus cabezas, conocidas como 'unicornios'.");
        datosCuriosos.add("Se habla de aves enormes, llamadas 'roc', que pueden llevar elefantes en sus garras según relatos de viajeros árabes.");
        datosCuriosos.add("En las cortes europeas, los alquimistas buscan la fórmula para convertir metales comunes en oro.");
        datosCuriosos.add("Los estudiosos debaten sobre la forma y naturaleza del mundo, algunos aún sostienen que la Tierra es plana.");
        datosCuriosos.add("Los textos antiguos mencionan que el sol es el centro del universo y que todos los astros giran a su alrededor.");
    }


    public String obtenerDatosAleatorio() {
        Random rand = new Random();
        int indiceAleatorio = rand.nextInt(datosCuriosos.size());
        return datosCuriosos.get(indiceAleatorio);
    }


}
