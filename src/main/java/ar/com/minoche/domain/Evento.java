package ar.com.minoche.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evento")
public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Evento;
    private String nombre_evento;
    private int fecha;
    private int hora;
    private String telefono_evento;
    private int limite;
    private String tipo;
    private String descripcion;
    private String categoria;
    private int cant_reservas;
    private int cant_entradas;
    private Creador_de_Eventos creador;
    private Lugar lugar;

    public Evento(String nombre_evento, int fecha, int hora, String telefono_evento, int limite, String tipo, String descripcion, String categoria, int cant_reservas, int cant_entradas, Creador_de_Eventos creador, Lugar lugar) {
        this.nombre_evento = nombre_evento;
        this.fecha = fecha;
        this.hora = hora;
        this.telefono_evento = telefono_evento;
        this.limite = limite;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.cant_reservas = cant_reservas;
        this.cant_entradas = cant_entradas;
        this.creador = creador;
        this.lugar = lugar;
    }

    public Evento() {
    }

    public Creador_de_Eventos getCreador() {
        return creador;
    }

    public void setCreador(Creador_de_Eventos creador) {
        this.creador = creador;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public int getId_Evento() {
        return id_Evento;
    }

    public void setId_Evento(int id_Evento) {
        this.id_Evento = id_Evento;
    }

    public String getNombre_evento() {
        return nombre_evento;
    }

    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getTelefono_evento() {
        return telefono_evento;
    }

    public void setTelefono_evento(String telefono_evento) {
        this.telefono_evento = telefono_evento;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCant_reservas() {
        return cant_reservas;
    }

    public void setCant_reservas(int cant_reservas) {
        this.cant_reservas = cant_reservas;
    }

    public int getCant_entradas() {
        return cant_entradas;
    }

    public void setCant_entradas(int cant_entradas) {
        this.cant_entradas = cant_entradas;
    }

}
