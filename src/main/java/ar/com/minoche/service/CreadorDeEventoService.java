
package ar.com.minoche.service;

import ar.com.minoche.domain.CreadorDeEvento;
import java.util.List;

public interface CreadorDeEventoService {
    List<CreadorDeEvento> listarCreador();
    
    public void guardar (CreadorDeEvento creador);
    public void eliminar (CreadorDeEvento creador);
    public CreadorDeEvento encontrarCliente(CreadorDeEvento creador);
}
