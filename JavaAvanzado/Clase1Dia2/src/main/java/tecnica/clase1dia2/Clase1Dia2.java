package tecnica.clase1dia2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Clase1Dia2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String nombre = null;
        while (nombre == null) {
            System.out.println("Ingrese su nombre");
            nombre = lector.nextLine();
            try {
                validarEntrada(nombre);
            } catch (CadenaVaciaException ex) {
                System.err.println("Excepción: " + ex.getMessage());
                nombre = null; // Volver a pedir el nombre
            } catch (NombreInvalidoException ex) {
                System.err.println("Excepción: " + ex.getMessage());
                nombre = null; // Volver a pedir el nombre
            }
        }

        String destino = null;
        while (destino == null) {
            System.out.println("Ingrese destino");
            destino = lector.nextLine();
            try {
                validarEntrada(destino);
            } catch (CadenaVaciaException ex) {
                System.err.println("Excepción: " + ex.getMessage());
                destino = null; // Volver a pedir el destino
            } catch (NombreInvalidoException ex) {
                System.err.println("Excepción: " + ex.getMessage());
                destino = null; // Volver a pedir el destino
            }
        }

        int numAsientos = -1;
        while (numAsientos < 1) {
            System.out.println("Ingrese la cantidad de asientos deseados");
            try {
                numAsientos = Integer.parseInt(lector.nextLine());
                validarAsientos(numAsientos);
            } catch (NumberFormatException ex) {
                System.err.println("Excepción: Debe ingresar un número válido.");
            } catch (AsientosInsuficientesException ex) {
                System.err.println("Excepción: " + ex.getMessage());
                numAsientos = -1; // Volver a pedir la cantidad de asientos
            }
        }

    }
//Creamos los metodos

    private static void validarEntrada(String entrada) throws CadenaVaciaException, NombreInvalidoException {
        if (entrada.trim().isEmpty()) {
            throw new CadenaVaciaException("Cadena vacía");
        }
//Compramos que  la entrada sean solo letras 
        String patron = "^[a-zA-Z]+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(entrada);

        if (!matcher.matches()) {
            throw new NombreInvalidoException("La entrada contiene números o caracteres especiales.");
        }
    }

    private static void validarAsientos(int numAsientos) throws AsientosInsuficientesException {
        int asientosDisponibles = 5; // Asignamos los asienos disponibles
        if (numAsientos > asientosDisponibles) {
            throw new AsientosInsuficientesException("No hay suficientes asientos disponibles.");
        }
    }
    //Creamos las excepciones 

    public static class CadenaVaciaException extends Exception {

        public CadenaVaciaException(String entradaVacia) {
            super(entradaVacia);
        }
    }

    public static class NombreInvalidoException extends Exception {

        public NombreInvalidoException(String message) {
            super(message);
        }
    }

    public static class AsientosInsuficientesException extends Exception {

        public AsientosInsuficientesException(String message) {
            super(message);
        }
    }
}
