package ar.com.minoche.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CreadorDeEvento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String provincia;
    
    @Column
    private String localidad;
    
    @Column
    private String domicilio;
    
    @Column
    private double saldo;
    
    @OneToMany
    List<Publicidad> eventoList;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona")
    Persona persona;
}
