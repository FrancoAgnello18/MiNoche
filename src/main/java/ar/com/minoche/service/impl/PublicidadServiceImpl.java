package ar.com.minoche.service.impl;

import ar.com.minoche.dao.PublicidadDAO;
import ar.com.minoche.domain.Publicidad;
import ar.com.minoche.service.PublicidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PublicidadServiceImpl implements PublicidadService{
    @Autowired
    private PublicidadDAO publicidadDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<Publicidad> listarPublicidades() {
        return (List<Publicidad>) publicidadDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Publicidad publicidad) {
        publicidadDAO.save(publicidad);
    }

    @Override
    @Transactional
    public void eliminar(Publicidad publicidad) {
        publicidadDAO.delete(publicidad);
    }

    @Override
    @Transactional
    public Publicidad encontrarPublicidad(Publicidad publicidad) {
        return publicidadDAO.findById(publicidad.getId()).orElse(null);
    }
    
}
