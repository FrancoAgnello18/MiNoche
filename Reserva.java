package ar.com.minoche.domain;

import java.io.Serializable;
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
@Table(name = "reserva")
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int fecha;
    private int cantPersonas;
    private String cod_qr;
    private int horario;
    
    @ManyToOne
    @JoinColumn(name = "id_evento")
    private Evento eventos;
    
    @ManyToOne
    @JoinColumn(name = "id_pago")
    private Pago pagos;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente clientes;
}