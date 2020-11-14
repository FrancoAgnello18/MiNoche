package ar.com.minoche.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "lugar")
public class Lugar implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String nombre;
    
    @Column
    private String email;
    
    @Column
    private String telefono;
    
    @Column
    private String tipo;
    
    @Column
    private String domicilio;
    
    @Column
    private String localidad;
    
    @Column
    private String provincia;
    
    @Column
    private String localizacion;

}
