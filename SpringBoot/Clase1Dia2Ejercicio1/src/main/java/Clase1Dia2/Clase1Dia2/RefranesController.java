package Clase1Dia2.Clase1Dia2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefranesController {
     private final Refranes refranes = new Refranes();

     @GetMapping()
     public String obtenerRefran() {
          return refranes.obtenerRefranAleatorio();
     }

}
