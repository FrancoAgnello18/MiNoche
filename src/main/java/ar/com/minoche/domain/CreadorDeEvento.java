package ar.com.minoche.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "creadorDeEvento")

public class CreadorDeEvento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private int id;
    private String provincia;
    private String localidad;
    private String domicilio;
    private double saldo;

    @OneToOne(mappedBy = "creadorDeEventos")
    private Persona persona;
    
    @OneToOne(mappedBy = "creadorDeEventos")
    private Cuenta cuenta;
    
    @OneToMany (mappedBy = "creadorDeEventos")
    private List<Evento> eventos;
}
