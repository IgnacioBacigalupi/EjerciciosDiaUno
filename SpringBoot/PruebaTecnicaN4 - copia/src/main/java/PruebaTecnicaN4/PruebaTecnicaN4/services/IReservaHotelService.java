package PruebaTecnicaN4.PruebaTecnicaN4.services;

import PruebaTecnicaN4.PruebaTecnicaN4.dto.ReservaHotelDto;
import PruebaTecnicaN4.PruebaTecnicaN4.model.ReservaHotel;

import java.util.List;

public interface IReservaHotelService {
    ReservaHotel crearReservaHotel(ReservaHotelDto reservaHotelDto);

    List<ReservaHotel> obtenerTodasLasReservaHotel();
}
