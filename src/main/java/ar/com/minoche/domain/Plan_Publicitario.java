
package ar.com.minoche.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plan_Publicitario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "id_Plan_Publicitario")
    private int idPlan_Publicitario;

    public int getIdPlan_Publicitario() {
        return idPlan_Publicitario;
    }

    public void setIdPlan_Publicitario(int idPlan_Publicitario) {
        this.idPlan_Publicitario = idPlan_Publicitario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDuracion_dias() {
        return duracion_dias;
    }

    public void setDuracion_dias(int duracion_dias) {
        this.duracion_dias = duracion_dias;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }
    private double precio;
    private int duracion_dias;
    private String alcance;
    
}
