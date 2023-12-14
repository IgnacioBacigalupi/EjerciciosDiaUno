package Clase1Dia2Ejercicio2.Clase1Dia2Ejercicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatosController {
    private final DatosCuriosos datos = new DatosCuriosos();

    @GetMapping()
    public String obtenerDatos() {
        return datos.obtenerDatosAleatorio();
    }

}
