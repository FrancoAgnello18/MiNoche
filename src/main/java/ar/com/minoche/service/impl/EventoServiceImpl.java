package ar.com.minoche.service.impl;

import ar.com.minoche.dao.EventoDAO;
import ar.com.minoche.domain.Evento;
import ar.com.minoche.service.EventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventoServiceImpl implements EventoService{

    @Autowired
    private EventoDAO eventoDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<Evento> listarEventos() {
        return (List<Evento>) eventoDAO.findAll();
    }

    @Override
    public void guardar(Evento evento) {
        eventoDAO.save(evento);
    }

    @Override
    public void eliminar(Evento evento) {
        eventoDAO.delete(evento);
    }

    @Override
    public Evento encontrarEvento(Evento evento) {
        return eventoDAO.findById(evento.getId()).orElse(null);
    }
    
}
