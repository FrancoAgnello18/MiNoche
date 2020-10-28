package ar.com.minoche.dao;

import ar.com.minoche.domain.Evento;
import java.util.List;

public interface EventoDAO {

    void insertEvento(Evento evento);

    void updateEvento(Evento evento);

    void deleteEvento(Evento evento);

    Evento findEventoById(long id);

    List<Evento> findAllEventos();

    long contadorEventos();

}
