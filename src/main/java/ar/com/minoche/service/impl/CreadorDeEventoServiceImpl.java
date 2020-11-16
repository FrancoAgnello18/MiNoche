package ar.com.minoche.service.impl;

import ar.com.minoche.dao.CreadorDeEventosDAO;
import ar.com.minoche.domain.CreadorDeEvento;
import ar.com.minoche.service.CreadorDeEventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CreadorDeEventoServiceImpl implements CreadorDeEventoService{

    @Autowired
    private CreadorDeEventosDAO creadorDeEventosDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<CreadorDeEvento> listarCreador() {
        return (List<CreadorDeEvento>) creadorDeEventosDAO.findAll();
    }

    @Override
    public void guardar(CreadorDeEvento creador) {
        creadorDeEventosDAO.save(creador);
    }

    @Override
    public void eliminar(CreadorDeEvento creador) {
        creadorDeEventosDAO.delete(creador);
    }

    @Override
    public CreadorDeEvento encontrarCliente(CreadorDeEvento creador) {
        return creadorDeEventosDAO.findById(creador.getId()).orElse(null);
    }
    
}
