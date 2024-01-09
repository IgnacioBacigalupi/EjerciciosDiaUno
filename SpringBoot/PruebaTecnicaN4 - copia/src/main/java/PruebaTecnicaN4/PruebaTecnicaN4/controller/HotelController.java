package PruebaTecnicaN4.PruebaTecnicaN4.controller;

import PruebaTecnicaN4.PruebaTecnicaN4.dto.HotelDto;
import PruebaTecnicaN4.PruebaTecnicaN4.model.Hotel;
import PruebaTecnicaN4.PruebaTecnicaN4.services.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/agency")
public class HotelController {
    @Autowired
    private IHotelService hotelService;


    @PostMapping("/hotels/new")
    public String agregarHotel(@RequestBody HotelDto hotelDto) {

        hotelService.crearHotel(hotelDto);
        return "Hotel creado";
    }


    @GetMapping("/hotels/search")
    public List<Hotel>  obtenertodosLosHoteles(@RequestParam LocalDate disponibleDesde,
                                               @RequestParam  LocalDate disponibleHasta,
                                               @RequestParam String ubicacion){
        return hotelService.obtenerHotelPorFechayLugar(disponibleDesde, disponibleHasta, ubicacion );
    }


    @GetMapping("/hotels")
    public List<Hotel> obtenerHoteles(){
        return hotelService.obtenerTodosLosHoteles();
    }

}
