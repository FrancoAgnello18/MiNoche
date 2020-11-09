
package ar.com.minoche.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
@Table(name = "pago")
public class Pago implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    
    @Column
    private String medioDePago;
    
    @Column
    private String nombreApellido;
    
    @Column
    private int dni;
    
    @Column
    private int numTarjeta;
    
    @Column
    private int codSeguridad;
    
    @Column
    private int fechaVencimiento;
    
    @Column
    private String codPago;
    
    @Column
    private int cbu;

    @OneToMany(mappedBy = "pago")
    List<Reserva> reservaList;
    
    @OneToMany(mappedBy = "Pago")
    List<Entrada> entradaList;
}
