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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
    
    @NotEmpty
    private String nombreEvento;
    
    @NotNull
    private String fecha;
    
//    @Column
//    private int hora;
    

    private String telefonoEvento;
    
    
    private int limite;
    
    
    private String tipo;
    

    private String descripcion;

    
    private String categoria;
    

    private int cantReservas;
    

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
