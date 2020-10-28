
package ar.com.minoche.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pago")
public class Pago implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String medio_de_pago;
    private String nombre_apellido;
    private int dni;
    private int num_tarjeta;
    private int cod_seguridad;
    private int fecha_venc;
    private String cod_pago;
    private int cbu;

    public Pago() {
    }

    public Pago(String medio_de_pago, String nombre_apellido, int dni, int num_tarjeta, int cod_seguridad, int fecha_venc, String cod_pago, int cbu) {
        this.medio_de_pago = medio_de_pago;
        this.nombre_apellido = nombre_apellido;
        this.dni = dni;
        this.num_tarjeta = num_tarjeta;
        this.cod_seguridad = cod_seguridad;
        this.fecha_venc = fecha_venc;
        this.cod_pago = cod_pago;
        this.cbu = cbu;
    }
    

    public Long getId() {
        return id;
    }

    public void setId_pago(Long id) {
        this.id = id;
    }

    public String getMedio_de_pago() {
        return medio_de_pago;
    }

    public void setMedio_de_pago(String medio_de_pago) {
        this.medio_de_pago = medio_de_pago;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNum_tarjeta() {
        return num_tarjeta;
    }

    public void setNum_tarjeta(int num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    public int getCod_seguridad() {
        return cod_seguridad;
    }

    public void setCod_seguridad(int cod_seguridad) {
        this.cod_seguridad = cod_seguridad;
    }

    public int getFecha_venc() {
        return fecha_venc;
    }

    public void setFecha_venc(int fecha_venc) {
        this.fecha_venc = fecha_venc;
    }

    public String getCod_pago() {
        return cod_pago;
    }

    public void setCod_pago(String cod_pago) {
        this.cod_pago = cod_pago;
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }
    
}
