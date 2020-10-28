package ar.com.minoche.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta")
public class Cuenta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String alias;
    private String cbu;
    private String banco;
    private CreadorDeEventos creadorDeEventos;

    public Cuenta(String alias, String cbu, String banco, CreadorDeEventos creadordeeventos) {
        this.alias = alias;
        this.cbu = cbu;
        this.banco = banco;
        this.creadorDeEventos = creadordeeventos;
    }

    public Cuenta() {
    }

    public CreadorDeEventos getCreadordeeventos() {
        return creadorDeEventos;
    }

    public void setCreadordeeventos(CreadorDeEventos creadordeeventos) {
        this.creadorDeEventos = creadordeeventos;
    }

    public Cuenta(String alias, String cbu, String banco) {
        this.alias = alias;
        this.cbu = cbu;
        this.banco = banco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

}
