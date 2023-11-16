/*Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente"). Implementa las siguientes operaciones utilizando Streams y Optionals:

Filtra los empleados cuyo salario sea mayor a cierto valor específico.

Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.

Encuentra al empleado con el salario más alto utilizando Optionals.*/
package ejercicioUno;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmpleadoMain {

	public static void main(String[] args) {

		List<Empleado> empleados = Arrays.asList(new Empleado("Luca", 1800.00, "Desarrollador"),
				new Empleado("Carlos", 1200.00, "Desarrollador"), new Empleado("julian", 1200.00, "Analista"),
				new Empleado("Juan", 800.00, "Gerente"), new Empleado("Nicolas", 700.00, "Cadete"),
				new Empleado("Ana", 900.00, "Desarrollador"), new Empleado("Sandra", 800.00, "Analista")

		); // Buscamos los empleados con salario mayor a 1000
		System.out.println("---------------Empleados con salario mayor a 1000------------");
		List<Empleado> salarioMayorA = empleados.stream().filter(p -> p.getSalario() > 1000).toList();

		System.out.println(salarioMayorA);
		// Agrupamos los empleaos por categoria

		System.out.println("-----------------Empleados por categoria-------------------");
		List<Empleado> listaDesarrolladores = empleados.stream()
				.filter(p -> p.getCategoria().equalsIgnoreCase("Desarrollador")).toList();

		System.out.println(listaDesarrolladores);
		// Agrupamos los empleaos por categoria
		List<Empleado> listaAnalista = empleados.stream().filter(p -> p.getCategoria().equalsIgnoreCase("Analista"))
				.toList();
		System.out.println(listaAnalista);
		// Agrupamos los empleaos por categoria
		List<Empleado> listaCadete = empleados.stream().filter(p -> p.getCategoria().equalsIgnoreCase("Cadete"))
				.toList();
		System.out.println(listaCadete);

		// Agrupamos los empleaos por categoria
		List<Empleado> listaGerente = empleados.stream().filter(p -> p.getCategoria().equalsIgnoreCase("Gerente"))
				.toList();
		System.out.println(listaGerente);

		// Promedio de salario por categoria

		System.out.println("-----------------Promedio de salario por categoria-----------");
		Map<String, Double> resultado = empleados.stream().collect(
				Collectors.groupingBy(p -> p.getCategoria(), Collectors.averagingDouble(Empleado::getSalario)));

		System.out.println("El promedio de salario de cada categoria es : " + resultado);

		System.out.println("--------------------Mayor salario--------------------");
		// Salario mayor
		OptionalDouble salarioMax = empleados.stream().mapToDouble(Empleado::getSalario).max();

		System.out.println("El salario maximo es : " + salarioMax.getAsDouble());

	}

}
