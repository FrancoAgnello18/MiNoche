
package ar.com.minoche.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "id_administrador")
    private int id_Administrador;
    private double saldo;

    public int getId_Administrador() {
        return id_Administrador;
    }

    public void setId_Administrador(int id_Administrador) {
        this.id_Administrador = id_Administrador;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
