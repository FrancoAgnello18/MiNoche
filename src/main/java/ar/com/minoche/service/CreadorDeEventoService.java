
package ar.com.minoche.service;

import ar.com.minoche.domain.CreadorDeEvento;
import java.util.List;

public interface CreadorDeEventoService {
    List<CreadorDeEvento> listarCreadorDeEventos();
    
    public void guardar (CreadorDeEvento creadorDeEvento);
    public void eliminar (CreadorDeEvento creadorDeEvento);
    public CreadorDeEvento encontrarCreadorDeEvento(CreadorDeEvento creadorDeEvento);
}
 