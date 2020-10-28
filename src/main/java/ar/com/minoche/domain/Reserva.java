package ar.com.minoche.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int fecha;
    private int cant_personas;
    
    @ManyToOne
    @JoinColumn(name = "id_evento")
    private Evento evento;
    
    private Cliente cliente;
    
    public Reserva() {
    }

    public Reserva(int fecha, int cant_personas, Evento evento, Cliente cliente) {
        this.fecha = fecha;
        this.cant_personas = cant_personas;
        this.evento = evento;
        this.cliente = cliente;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId_Reserva(Long id) {
        this.id = id;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getCant_personas() {
        return cant_personas;
    }

    public void setCant_personas(int cant_personas) {
        this.cant_personas = cant_personas;
    }

}
