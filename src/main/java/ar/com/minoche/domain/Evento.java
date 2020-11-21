package ar.com.minoche.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
    private Long id;
    
    @Column
    private String nombreEvento;
    
    @Column
    private String fecha;
    
//    @Column
//    private int hora;
    
    @Column
    private String telefonoEvento;
    
    @Column
    private int limite;
    
    @Column
    private String tipo;
    
    @Column
    private String descripcion;
    
    @Column
    private String categoria;
    
    @Column
    private int cantReservas;
    
    @Column
    private int cantEntradas;
    
    @OneToMany(mappedBy = "evento")
    List<Reserva> reservaList;
    
    @OneToMany(mappedBy = "evento")
    List<Entrada> entradaList;

    @OneToMany(mappedBy = "evento")
    List<Publicidad> publicidadList;
    
    @ManyToOne
    @JoinColumn(name = "id_creadorDeEvento")
    CreadorDeEvento creadorDeEvento;
    
    @OneToOne
    @JoinColumn(name = "id_lugar")
    Lugar lugar;
}
