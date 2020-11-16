package ar.com.minoche.service;

import ar.com.minoche.domain.Reserva;
import java.util.List;

public interface ReservaService {
    List<Reserva> listarReservas();
    
    public void guardar (Reserva reserva);
    public void eliminar (Reserva reserva);
    public Reserva encontrarReserva(Reserva reserva);
}
