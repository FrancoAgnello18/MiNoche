
package ar.com.minoche.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publicidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "id_publicidad")
    private int idPublicidad;

    public int getIdPublicidad() {
        return idPublicidad;
    }

    public void setIdPublicidad(int idPublicidad) {
        this.idPublicidad = idPublicidad;
    }

    public int getFlyer() {
        return flyer;
    }

    public void setFlyer(int flyer) {
        this.flyer = flyer;
    }
    private int flyer;
}
