package ejercicioUno;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directorio directorioPrincipal = new Directorio("Directorio Principal", new ArrayList<>(), new ArrayList<>());

        Directorio subDirectorio1 = new Directorio("SubDirectorio1", new ArrayList<>(), new ArrayList<>());
        Directorio subDirectorio2 = new Directorio("SubDirectorio2", new ArrayList<>(), new ArrayList<>());
        Directorio subDirectorio3 = new Directorio("SubDirectorio3", new ArrayList<>(), new ArrayList<>());

        directorioPrincipal.getSubdirectorios().add(subDirectorio1);
        directorioPrincipal.getSubdirectorios().add(subDirectorio2);
        directorioPrincipal.getSubdirectorios().add(subDirectorio3);

        List<String> archivosSubDirectorio1 = new ArrayList<>();
        archivosSubDirectorio1.add("Archivo1");
        archivosSubDirectorio1.add("Archivo2");
        subDirectorio1.setArchivos(archivosSubDirectorio1);

        List<String> archivosSubDirectorio2 = new ArrayList<>();
        archivosSubDirectorio2.add("Archivo3");
        subDirectorio2.setArchivos(archivosSubDirectorio2);
        
        List<String>archivosSubDirectorio3=new ArrayList<>();
        archivosSubDirectorio3.add("Archivo1");
        subDirectorio3.setArchivos(archivosSubDirectorio3);


        mostrarDirectorios(directorioPrincipal);
    }

    public static void mostrarDirectorios(Directorio directorio) {
        System.out.println("Directorio: " + directorio.getNombre());
        System.out.println("Archivos: " + directorio.getArchivos());

        for (Directorio subDirectorio : directorio.getSubdirectorios()) {
            mostrarDirectorios(subDirectorio);
        }
    }
}