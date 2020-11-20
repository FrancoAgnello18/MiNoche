
package ar.com.minoche.service.impl;

import ar.com.minoche.dao.AdministradorDAO;
import ar.com.minoche.domain.Administrador;
import ar.com.minoche.service.AdministradorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdministradorServiceImpl implements AdministradorService{
    @Autowired
    private AdministradorDAO administradorDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<Administrador> listarAdministradores() {
        return (List<Administrador>) administradorDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Administrador administrador) {
        administradorDAO.save(administrador);
    }

    @Override
    public void eliminar(Administrador administrador) {
        administradorDAO.delete(administrador);
    }

    @Override
    @Transactional
    public Administrador encontrarAdministrador(Administrador administrador) {
        return administradorDAO.findById(administrador.getId()).orElse(null);
    }
}
