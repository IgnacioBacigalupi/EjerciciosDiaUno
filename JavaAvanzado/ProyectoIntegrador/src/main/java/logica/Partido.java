
package logica;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Partido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;
    private String fecha;
    private Integer resultadoEquipo1;
    private Integer resultadoEquipo2;    

    @ManyToOne
    private Equipo equipo1;
    
    @ManyToOne
    private Equipo equipo2;   


    
    public Partido() {
    }

    public Partido(Long id, String fecha, Integer resultadoEquipo1, Integer resultadoEquipo2, Equipo equipo1, Equipo equipo2) {
        this.id = id;
        this.fecha = fecha;
        this.resultadoEquipo1 = resultadoEquipo1;
        this.resultadoEquipo2 = resultadoEquipo2;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getResultadoEquipo1() {
        return resultadoEquipo1;
    }

    public void setResultadoEquipo1(Integer resultadoEquipo1) {
        this.resultadoEquipo1 = resultadoEquipo1;
    }

    public Integer getResultadoEquipo2() {
        return resultadoEquipo2;
    }

    public void setResultadoEquipo2(Integer resultadoEquipo2) {
        this.resultadoEquipo2 = resultadoEquipo2;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

   

    

}
