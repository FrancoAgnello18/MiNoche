
package ar.com.minoche.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plan_publicitario")
public class Plan_Publicitario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idPlan_Publicitario;
    private double precio;
    private int duracion_dias;
    private String alcance;

    public Plan_Publicitario() {
    }

    public Plan_Publicitario(double precio, int duracion_dias, String alcance) {
        this.precio = precio;
        this.duracion_dias = duracion_dias;
        this.alcance = alcance;
    }
    
    
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
    
}
