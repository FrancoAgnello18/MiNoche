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
@Table(name = "cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String sexo;
    private String provincia;
    private String localidad;
    private String domicilio;
    private String localizacion;
    
    @OneToMany(mappedBy = "cliente")
    private List<Entrada> entradas;
    
    @OneToMany(mappedBy = "cliente")
    private List<Reserva> reservas;

    @OneToOne(mappedBy = "cliente")
    private Persona persona;
}
