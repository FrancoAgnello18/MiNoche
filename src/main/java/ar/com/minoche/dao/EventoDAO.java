package ar.com.minoche.dao;

import ar.com.minoche.domain.Evento;
import org.springframework.data.repository.CrudRepository;
public interface EventoDAO extends CrudRepository <Evento, Long> {

}
