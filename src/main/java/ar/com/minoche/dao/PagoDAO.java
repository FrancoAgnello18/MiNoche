
package ar.com.minoche.dao;

import ar.com.minoche.domain.Pago;
import java.util.List;


public interface PagoDAO {
    
    void insertPago(Pago pago);

    void updatePago(Pago pago);

    void deletePago(Pago pago);

    Pago findPagoById(long id);

    List<Pago> findAllPagos();

    long contadorPagos();
    
}
