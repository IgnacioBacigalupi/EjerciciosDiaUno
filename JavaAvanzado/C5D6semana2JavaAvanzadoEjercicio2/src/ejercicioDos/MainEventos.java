package ejercicioDos;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class MainEventos {

	public static void main(String[] args) throws ParseException {


		List<Eventos> evento = List.of(

				new Eventos("Evento1", LocalDate.of(2000, 11, 8), "Reunion"), new Eventos("Evento2", LocalDate.of(2023, 11, 7), "Reunion"),
				new Eventos("Evento3", LocalDate.of(2023, 10, 6), "Reunion"), new Eventos("Evento4", LocalDate.of(2023, 10, 26), "Conferencia"),
				new Eventos("Evento5", LocalDate.of(2023, 12, 18), "Conferencia"), new Eventos("Evento6", LocalDate.of(2023, 10, 17), "Conferencia"),
				new Eventos("Evento7", LocalDate.of(2023, 11, 15), "Taller"), new Eventos("Evento8", LocalDate.of(2020, 10, 18), "Taller")

		);
								System.out.println("/-//-//-//-/Eventos por fecha/-//-//-//-/");
												
		List<Eventos> eventosPorFecha = evento.stream().filter(p -> p.getFecha().equals(LocalDate.of(2023, 10, 6))).toList();

		System.out.println(eventosPorFecha);
										System.out.println("/-//-//-//-/Cantidad de eventos por categoria/-//-//-//-/");
		                  Map<String, Long> cantidadDeEventos = evento.stream()
		                    .collect(Collectors.groupingBy(p -> p.getCategoria(),Collectors.counting()));
		                  
		                  System.out.println(cantidadDeEventos);
		                    System.out.println("/-//-//-//-/Evento mas proximo a la fecha actual/-//-//-//-/");
		                  Optional<Eventos> eventoMasProximo = evento.stream()
		                          .filter(x -> LocalDate.now().compareTo(x.getFecha()) <= 0)
		                          .min(Comparator.comparing(x -> ChronoUnit.YEARS.between(LocalDate.now(), x.getFecha())));
		                  
		                  eventoMasProximo.ifPresent(eventoEncontrado -> {
		                      System.out.println("El evento mas proximo es: \n" + eventoEncontrado);
		                  });
		                    

	}

}
