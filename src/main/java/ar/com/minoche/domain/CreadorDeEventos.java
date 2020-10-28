package ar.com.minoche.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creador_de_evento")
// TODO: cambiar nombre de clases
public class CreadorDeEventos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    // todo: cambiar nombre de atributo usando camel case (idCreadorDeEventtos)
    private Long id;
    // private int id
    private Persona persona;
    private String provincia;
    private String localidad;
    private String domicilio;
    private double saldo;

    public CreadorDeEventos(Persona persona, String provincia, String localidad, String domicilio, double saldo) {
        this.persona = persona;
        this.provincia = provincia;
        this.localidad = localidad;
        this.domicilio = domicilio;
        this.saldo = saldo;
    }

    public CreadorDeEventos() {
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Long getId_creadordeeventos() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

}
