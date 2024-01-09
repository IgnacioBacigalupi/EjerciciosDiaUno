package PruebaTecnicaN4.PruebaTecnicaN4.services;

import PruebaTecnicaN4.PruebaTecnicaN4.dto.HotelDto;
import PruebaTecnicaN4.PruebaTecnicaN4.model.Hotel;

import java.time.LocalDate;
import java.util.List;

public interface IHotelService {

    Hotel crearHotel(HotelDto hotelDto);

    List<Hotel> obtenerHotelPorFechayLugar(LocalDate disponibleDesde, LocalDate disponibleHasta , String ubicacion  );

    List <Hotel> obtenerTodosLosHoteles();
}

