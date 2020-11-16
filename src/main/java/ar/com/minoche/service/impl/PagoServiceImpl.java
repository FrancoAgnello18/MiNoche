
package ar.com.minoche.service.impl;

import ar.com.minoche.dao.PagoDAO;
import ar.com.minoche.domain.Pago;
import ar.com.minoche.service.PagoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PagoServiceImpl implements PagoService{

    @Autowired
    private PagoDAO pagoDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<Pago> listarPagos() {
        return (List<Pago>) pagoDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Pago pago) {
        pagoDAO.save(pago);
    }

    @Override
    @Transactional
    public void eliminar(Pago pago) {
        pagoDAO.delete(pago);
    }

    @Override
    @Transactional
    public Pago encontrarEvento(Pago pago) {
        return pagoDAO.findById(pago.getId()).orElse(null);
    }
    
}
