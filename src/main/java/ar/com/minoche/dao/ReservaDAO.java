
package ar.com.minoche.dao;

import ar.com.minoche.domain.Reserva;
import java.util.List;

public interface ReservaDAO {
    
    void insertReserva(Reserva reserva);

    void updateReserva(Reserva reserva);

    void deleteReserva(Reserva reserva);

    Reserva findReservaById(long id);

    List<Reserva> findAllReservas();

    long contadorReservas();
    
}
