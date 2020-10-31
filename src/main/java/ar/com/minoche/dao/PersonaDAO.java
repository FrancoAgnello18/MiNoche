
package ar.com.minoche.dao;

import ar.com.minoche.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository <Persona, Long> {

}