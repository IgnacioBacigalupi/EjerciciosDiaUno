package PruebaTecnicaN4.PruebaTecnicaN4.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VueloDto {

    private String origen;

    private String destino;

    private String tipoDeAsiento;

    private Double precioVuelo;

    private LocalDate fecha;



}
