
package ar.com.minoche.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "id_pago")
    private int id_pago;
    private String medio_de_pago;
    private String nombre_apellido;
    private int dni;
    private int num_tarjeta;
    private int cod_seguridad;
    private int fecha_venc;
    private String cod_pago;
    private int cbu;

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
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
