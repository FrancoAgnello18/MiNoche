package ar.com.minoche.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Creador_de_Eventos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "id_Creador_de_Eventos")
    private int id_creadordeeventos;

    public int getId_creadordeeventos() {
        return id_creadordeeventos;
    }

    public void setId_creadordeeventos(int id_creadordeeventos) {
        this.id_creadordeeventos = id_creadordeeventos;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private String provincia;
    private String localidad;
    private String domicilio;
    private double saldo;

}
