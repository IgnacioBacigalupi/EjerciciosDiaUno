package PruebaTecnicaN4.PruebaTecnicaN4.controller;

import PruebaTecnicaN4.PruebaTecnicaN4.dto.ReservaVueloDto;
import PruebaTecnicaN4.PruebaTecnicaN4.model.Hotel;
import PruebaTecnicaN4.PruebaTecnicaN4.model.ReservaVuelo;
import PruebaTecnicaN4.PruebaTecnicaN4.services.IHotelService;
import PruebaTecnicaN4.PruebaTecnicaN4.services.IReservaVueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agency")
public class ReservaVueloController {

    @Autowired
    private IReservaVueloService reservaVueloService;




    @PostMapping("/flight-booking/new")
    public ResponseEntity<?> crearReservaVuelo(@RequestBody ReservaVueloDto reservaVueloDt0){
        ReservaVuelo reservaVuelo = reservaVueloService.crearReservaVuelo(reservaVueloDt0);

        if(reservaVuelo == null){
            return  ResponseEntity.badRequest().body("La reserva no puede ser en el pasado o el vuelo ya esta reservado");
        }
        double precio = reservaVuelo.getVuelo().getPrecioVuelo();
        return  ResponseEntity.ok().body("El precio total del vuelo es :" + precio * reservaVueloDt0.getPeopleQ());
    }

}
