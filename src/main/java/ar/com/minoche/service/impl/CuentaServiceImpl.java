package ar.com.minoche.service.impl;

import ar.com.minoche.dao.CuentaDAO;
import ar.com.minoche.domain.Cuenta;
import ar.com.minoche.service.CuentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private CuentaDAO cuentaDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<Cuenta> listarCuenta() {
        return (List<Cuenta>) cuentaDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Cuenta cuenta) {
        cuentaDAO.save(cuenta);
    }

    @Override
    @Transactional
    public void eliminar(Cuenta cuenta) {
        cuentaDAO.delete(cuenta);
    }

    @Override
    @Transactional(readOnly = true)
    public Cuenta encontrarCuenta(Cuenta cuenta) {
        return cuentaDAO.findById(cuenta.getId()).orElse(null);
    }
}
