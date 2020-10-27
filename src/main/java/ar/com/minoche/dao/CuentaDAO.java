package ar.com.minoche.dao;

import ar.com.minoche.domain.Cuenta;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CuentaDAO  {

    void insertCuenta(Cuenta cuenta);

    void updateCuenta(Cuenta cuenta);

    void deleteCuenta(Cuenta cuenta);

    Cuenta findCuentaById(long id);

    List<Cuenta> findAllCuentas();

    long contadorCuentas();

  
}

