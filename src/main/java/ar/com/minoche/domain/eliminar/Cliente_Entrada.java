
package ar.com.minoche.domain.eliminar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente_Entrada {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "id_Cliente-Entrada")
    private int idCliente_Entrada;

    public int getIdCliente_Entrada() {
        return idCliente_Entrada;
    }

    public void setIdCliente_Entrada(int idCliente_Entrada) {
        this.idCliente_Entrada = idCliente_Entrada;
    }
}
