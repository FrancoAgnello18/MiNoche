package ar.com.minoche.dao;

import ar.com.minoche.domain.Cuenta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CuentaDAO extends CrudRepository<Cuenta, Long> {

    // por query
    //@Query("select c from Cuenta c where c.cbu = ?1")
    //Cuenta buscarCuentaPorCbu(String cbu);
    
    // por nombre de método
    Cuenta findCuentaByAlias(String alias);

    Cuenta findCuentaByCbu(String cbu);
    
    Cuenta findCuentaByBanco (String banco);
    

}
