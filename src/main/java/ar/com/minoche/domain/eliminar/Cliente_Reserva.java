
package ar.com.minoche.domain.eliminar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente_Reserva {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "id_Cliente_Reserva")
    private int idCliente_Reserva;

    public int getIdCliente_Reserva() {
        return idCliente_Reserva;
    }

    public void setIdCliente_Reserva(int idCliente_Reserva) {
        this.idCliente_Reserva = idCliente_Reserva;
    }
    
}
