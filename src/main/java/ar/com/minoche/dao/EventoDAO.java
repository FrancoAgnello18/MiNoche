package ar.com.minoche.dao;

import ar.com.minoche.domain.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoDAO extends CrudRepository<Evento, Long> {

    Evento findEventoByNombreEvento(String nombreEvento);

    Evento findEventoByFecha(int fecha);

    Evento findEventoByHora(int hora);

    Evento findEventoByTelefonoEvento(String telefonoEvento);

    Evento findEventoByLimite(int limite);

    Evento findEventoByTipo(String tipo);

    Evento findEventoByDescripcion(String descripcion);

    Evento findEventoByCategoria(String nombreEvento);

    Evento findEventoByCantReservas(String cantReservas);

    Evento findEventoByCantEntradas(String cantEntradas);

}
