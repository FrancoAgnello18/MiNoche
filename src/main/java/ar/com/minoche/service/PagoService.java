
package ar.com.minoche.service;

import ar.com.minoche.domain.Pago;
import java.util.List;

public interface PagoService {
    List<Pago> listarPagos();
    
    public void guardar (Pago pago);
    public void eliminar (Pago pago);
    public Pago encontrarPago(Pago pago);
}
