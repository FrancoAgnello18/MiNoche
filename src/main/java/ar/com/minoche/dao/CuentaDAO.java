package ar.com.minoche.dao;

import ar.com.minoche.domain.Cuenta;
import org.springframework.data.repository.CrudRepository;

public interface CuentaDAO extends CrudRepository<Cuenta, Long>{
    
}
