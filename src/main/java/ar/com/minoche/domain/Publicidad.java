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
    private int idPublicidad;
    private int flyer;
    private Plan_Publicitario promocion;
    private Evento evento;

    public Publicidad() {
    }

    public Publicidad(int flyer, Plan_Publicitario promocion, Evento evento) {
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

    public Plan_Publicitario getPromocion() {
        return promocion;
    }

    public void setPromocion(Plan_Publicitario promocion) {
        this.promocion = promocion;
    }

    public int getIdPublicidad() {
        return idPublicidad;
    }

    public void setIdPublicidad(int idPublicidad) {
        this.idPublicidad = idPublicidad;
    }

    public int getFlyer() {
        return flyer;
    }

    public void setFlyer(int flyer) {
        this.flyer = flyer;
    }
}
