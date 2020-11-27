package ar.com.minoche.dao;

import ar.com.minoche.domain.Administrador;
import org.springframework.data.repository.CrudRepository;

public interface AdministradorDAO extends CrudRepository <Administrador, Long> {
    
    Administrador findAdministradorBySaldo(Double saldo);

}
