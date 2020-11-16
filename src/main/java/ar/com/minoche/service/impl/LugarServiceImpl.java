package ar.com.minoche.service.impl;

import ar.com.minoche.dao.LugarDAO;
import ar.com.minoche.domain.Lugar;
import ar.com.minoche.service.LugarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LugarServiceImpl implements LugarService{

    @Autowired
    private LugarDAO lugarDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<Lugar> listarLugares() {
        return (List<Lugar>) lugarDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Lugar lugar) {
        lugarDAO.save(lugar);
    }

    @Override
    @Transactional
    public void eliminar(Lugar lugar) {
        lugarDAO.delete(lugar);
    }

    @Override
    @Transactional
    public Lugar encontrarLugar(Lugar lugar) {
        return lugarDAO.findById(lugar.getId()).orElse(null);
    }
    
}
