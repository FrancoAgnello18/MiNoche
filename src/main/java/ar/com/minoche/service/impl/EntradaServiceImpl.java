package ar.com.minoche.service.impl;

import ar.com.minoche.dao.EntradaDAO;
import ar.com.minoche.domain.Entrada;
import ar.com.minoche.service.EntradaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EntradaServiceImpl implements EntradaService{

    @Autowired
    private EntradaDAO entradaDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<Entrada> listarEntradas() {
        return (List<Entrada>) entradaDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Entrada entrada) {
        entradaDAO.save(entrada);
    }

    @Override
    @Transactional
    public void eliminar(Entrada entrada) {
        entradaDAO.delete(entrada);
    }

    @Override
    @Transactional (readOnly = true)
    public Entrada encontrarEntrada(Entrada entrada) {
        return entradaDAO.findById(entrada.getId()).orElse(null);
    }
    
}
