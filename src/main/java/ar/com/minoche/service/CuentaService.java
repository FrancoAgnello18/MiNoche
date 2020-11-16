package ar.com.minoche.service;

import ar.com.minoche.domain.Cuenta;
import java.util.List;

public interface CuentaService {
//    List<Cuenta> findAllCuentas();
//    
//    Cuenta findCuentaById(Long id);
//    // save
//    Cuenta guardarCuenta(Cuenta cuenta);
//    // update
//    Cuenta updateCuenta(Cuenta cuenta);
//    // delete
//    Cuenta eliminarCuenta(Cuenta cuenta);
    List<Cuenta> listarCuentas();
    
    public void guardar (Cuenta cuenta);
    public void eliminar (Cuenta cuenta);
    public Cuenta encontrarCuenta(Cuenta cuenta);
}
