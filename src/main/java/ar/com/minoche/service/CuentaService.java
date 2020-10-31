package ar.com.minoche.service;

import ar.com.minoche.domain.Cuenta;
import java.util.List;

public interface CuentaService {
    List<Cuenta> findAllCuentas();
    Cuenta findCuentaById(Long id);
    // save
    // update
    Cuenta updateCuenta(Cuenta cuenta);
    // delete
}
