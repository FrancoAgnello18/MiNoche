package ar.com.minoche.service.impl;

import ar.com.minoche.dao.CuentaDAO;
import ar.com.minoche.domain.Cuenta;
import ar.com.minoche.service.CuentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private CuentaDAO cuentaDAO;

    @Override
    public List<Cuenta> findAllCuentas() {
        return (List<Cuenta>) cuentaDAO.findAll();
    }

    @Override
    public Cuenta findCuentaById(Long id) {
        return cuentaDAO.findById(id).orElse(null);
    }

    @Override
    public Cuenta updateCuenta(Cuenta cuenta) {
        
        if (cuenta == null) {
            //return null;
            throw new IllegalArgumentException("No se encontró la cuenta especificada");
        }
        
        if (cuenta.getId() == null) {
            // return null;
            throw new IllegalArgumentException("No se encontró la cuenta especificada");
        }
        
        //Cuenta cuentaAux = cuentaDAO.findById(cuenta.getId()).orElse(null);
        
        Cuenta cuentaAux = cuentaDAO.findById(cuenta.getId())
                .orElseThrow(() -> new IllegalArgumentException("No se encontró la cuenta especificada"));
        
        
        if (cuentaAux == null) {
            // return null;
            throw new IllegalArgumentException("No se encontró la cuenta especificada");
        }
        
        return cuentaDAO.save(cuenta);
    }

    
}
