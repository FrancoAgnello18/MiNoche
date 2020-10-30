
package ar.com.minoche.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private int id;
    private String medioDePago;
    private String nombreApellido;
    private int dni;
    private int numTarjeta;
    private int codSeguridad;
    private int fechaVencimiento;
    private String codPago;
    private int cbu;

    @OneToMany(mappedBy = "pago")
    private Entrada entradas;
    
    @OneToMany(mappedBy = "pago")
    private Reserva reservas;   
}