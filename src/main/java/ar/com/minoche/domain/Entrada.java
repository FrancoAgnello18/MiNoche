
package ar.com.minoche.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entrada {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "id_entrada")
    private int id_entrada;

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    private String cod_qr;
    private String precio;
    private String sexo;
            
}
