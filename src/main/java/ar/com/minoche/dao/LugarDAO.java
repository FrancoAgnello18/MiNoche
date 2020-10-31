package ar.com.minoche.dao;

import ar.com.minoche.domain.Lugar;
import org.springframework.data.repository.CrudRepository;

public interface LugarDAO extends CrudRepository <Lugar, Long> {

}
