package ar.com.minoche.service.impl;

import ar.com.minoche.dao.ReservaDAO;
import ar.com.minoche.domain.Reserva;
import ar.com.minoche.service.ReservaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    private ReservaDAO reservaDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<Reserva> listarReservas() {
        return (List<Reserva>) reservaDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Reserva reserva) {
        reservaDAO.save(reserva);
    }

    @Override
    @Transactional
    public void eliminar(Reserva reserva) {
        reservaDAO.delete(reserva);
    }

    @Override
    @Transactional
    public Reserva encontrarReserva(Reserva reserva) {
        return reservaDAO.findById(reserva.getId()).orElse(null);
    }
    
}
