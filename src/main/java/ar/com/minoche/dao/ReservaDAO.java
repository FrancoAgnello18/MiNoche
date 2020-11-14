package ar.com.minoche.dao;

import ar.com.minoche.domain.Reserva;
import org.springframework.data.repository.CrudRepository;

public interface ReservaDAO extends CrudRepository<Reserva, Long> {

    Reserva findReservaByFecha(int fecha);

    Reserva findReservaByCantPersonas(int cantPersonas);

    Reserva findReservaByCodQr(String cod_qr);

    Reserva findReservaByHorario(int horario);

}
