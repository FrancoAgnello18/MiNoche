
package ar.com.minoche.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="entrada")
public class Entrada implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_entrada;
    private String cod_qr;
    private String precio;
    private String sexo;
    private Evento evento;

    public Entrada() {
    }

    public Entrada(String cod_qr, String precio, String sexo, Evento evento) {
        this.cod_qr = cod_qr;
        this.precio = precio;
        this.sexo = sexo;
        this.evento = evento;
    }
    

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public String getCod_qr() {
        return cod_qr;
    }

    public void setCod_qr(String cod_qr) {
        this.cod_qr = cod_qr;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    }

  
            

