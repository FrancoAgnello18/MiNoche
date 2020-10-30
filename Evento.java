package ar.com.minoche.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "evento")
public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEvento;
    private int fecha;
    private int hora;
    private String telefonoEvento;
    private int limite;
    private String tipo;
    private String descripcion;
    private String categoria;
    private int cantReservas;
    private int cantEntradas;
    
    @OneToMany(mappedBy = "evento")
    private List<Reserva> reservas;
    
    @OneToMany(mappedBy = "evento")
    private List<Entrada> entradas;

    @OneToMany(mappedBy = "evento")
    private List<Publicidad> publicidad;
    
    @ManyToOne
    @JoinColumn(name = "id_creadorDeEventos")
    private CreadorDeEventos creadorDeEventos;
    
    @OneToOne(mappedBy = "evento")
    private List<Lugar> lugar;
}
