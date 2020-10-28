package ar.com.minoche.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publicidad")
public class Publicidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int flyer;
    private PlanPublicitario promocion;
    private Evento evento;

    public Publicidad() {
    }

    public Publicidad(int flyer, PlanPublicitario promocion, Evento evento) {
        this.flyer = flyer;
        this.promocion = promocion;
        this.evento = evento;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public PlanPublicitario getPromocion() {
        return promocion;
    }

    public void setPromocion(PlanPublicitario promocion) {
        this.promocion = promocion;
    }

    public Long getId() {
        return id;
    }

    public void setIdPublicidad(Long id) {
        this.id = id;
    }

    public int getFlyer() {
        return flyer;
    }

    public void setFlyer(int flyer) {
        this.flyer = flyer;
    }
}
