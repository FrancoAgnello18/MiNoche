package ar.com.minoche.dao;

import ar.com.minoche.domain.Pago;
import org.springframework.data.repository.CrudRepository;

public interface PagoDAO extends CrudRepository<Pago, Long> {

    Pago findPagoByMedioDePago(String medioDePago);

    Pago findPagoByNombreApellido(String nombreApellido);

    Pago findPagoByDni(int dni);

    Pago findPagoByNumTarjeta(int numTarjeta);

    Pago findPagoByCodSeguridad(int codSeguridad);

    Pago findPagoByFechaVencimiento(int fechaVencimiento);

    Pago findPagoByCodPago(String codPago);

    Pago findPagoByCbu(int cbu);

}
