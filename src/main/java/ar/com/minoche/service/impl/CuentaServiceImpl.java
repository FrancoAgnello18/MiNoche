package ar.com.minoche.service.impl;

import ar.com.minoche.dao.CuentaDAO;
import ar.com.minoche.domain.Cuenta;
import ar.com.minoche.service.CuentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaServiceImpl implements CuentaService{
    
    @Autowired
    private CuentaDAO cuentaDAO;

    @Override
    public List<Cuenta> findAllCuentas() {
        return (List<Cuenta>) cuentaDAO.findAll();
    }
    
}
