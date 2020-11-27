package ar.com.minoche.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "entrada")
public class Entrada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String codQr;
    
    @Column
    private String precio;
    
    @ManyToOne
    @JoinColumn(name = "id_evento")
    Evento evento;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_pago")
    Pago pago;
}
