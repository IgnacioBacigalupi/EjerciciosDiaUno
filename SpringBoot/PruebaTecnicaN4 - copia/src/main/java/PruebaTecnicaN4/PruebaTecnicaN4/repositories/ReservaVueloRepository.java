package PruebaTecnicaN4.PruebaTecnicaN4.repositories;

import PruebaTecnicaN4.PruebaTecnicaN4.model.Hotel;
import PruebaTecnicaN4.PruebaTecnicaN4.model.ReservaVuelo;
import PruebaTecnicaN4.PruebaTecnicaN4.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Repository
public interface ReservaVueloRepository  extends JpaRepository<ReservaVuelo , Long> {

    @Query("SELECT r FROM ReservaVuelo r WHERE r.vuelo = :vuelo")
    List<ReservaVuelo> findReservasByVuelo(@Param("vuelo") Vuelo vuelo);
}
