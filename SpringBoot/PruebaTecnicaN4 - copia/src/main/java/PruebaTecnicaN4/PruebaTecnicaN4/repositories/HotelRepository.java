package PruebaTecnicaN4.PruebaTecnicaN4.repositories;

import PruebaTecnicaN4.PruebaTecnicaN4.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface HotelRepository  extends JpaRepository<Hotel , Long> {

    Hotel findByCodigoHotel (String codigoHotel);

    @Query("SELECT DISTINCT h"+
     " FROM Hotel h" +
    " JOIN h.habitaciones r " +
      " WHERE h.ubicacion = :ubicacion " +
      " and r.disponibleDesde between :disponibleDesde  and :disponibleHasta" )
    List<Hotel> getHoteles (LocalDate disponibleDesde , LocalDate disponibleHasta  , String ubicacion  );



}
