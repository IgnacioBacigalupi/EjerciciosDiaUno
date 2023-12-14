package Dia2Clase3Ejercicio1.Dia2Clase3Ejercicio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertirController {

    @GetMapping("/convertir")
    public String convertirCentimetrosAMetros(@RequestParam("centimetros") double centimetros) {
        double metros = centimetros / 100; // Conversión de centímetros a metros
        return  centimetros + " cm son " + metros + "M";
    }
}
