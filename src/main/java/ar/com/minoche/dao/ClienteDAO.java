
package ar.com.minoche.dao;

import ar.com.minoche.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDAO extends CrudRepository <Cliente, Long> {

}
