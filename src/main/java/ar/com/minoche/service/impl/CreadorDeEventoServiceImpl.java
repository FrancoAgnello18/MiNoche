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
    public List<CreadorDeEvento> listarCreadoresDeEventos() {
        return (List<CreadorDeEvento>) creadorDeEventosDAO.findAll();
    }

    @Override
    public void guardar(CreadorDeEvento creadorDeEvento) {
        creadorDeEventosDAO.save(creadorDeEvento);
    }

    @Override
    public void eliminar(CreadorDeEvento creadorDeEvento) {
        creadorDeEventosDAO.delete(creadorDeEvento);
    }

    @Override
    public CreadorDeEvento encontrarCreadorDeEvento(CreadorDeEvento creadorDeEvento) {
        return creadorDeEventosDAO.findById(creadorDeEvento.getId()).orElse(null);
    }
    
}
