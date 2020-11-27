package ar.com.minoche.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "reserva")
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String fecha;
    
    @Column
    private int cantPersonas;
    
    @Column
    private String codQr;
    
//    @Column
//    private int horario;
    
    @ManyToOne
    @JoinColumn(name = "id_evento")
    Evento evento;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    Cliente cliente;
    
    @OneToOne
    @JoinColumn(name = "id_pago")
    Pago pago;
}
