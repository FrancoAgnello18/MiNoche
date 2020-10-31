
package ar.com.minoche.dao;

import ar.com.minoche.domain.CreadorDeEventos;
import java.util.List;


public interface CreadorDeEventosDAO {
    
    void insertCreadorDeEventos(CreadorDeEventos creadorDeEventos);

    void updateCreadorDeEventos(CreadorDeEventos creadorDeEventos);

    void deleteCreadorDeEventos(CreadorDeEventos creadorDeEventos);

    CreadorDeEventos findCreadorDeEventosById(long id);

    List<CreadorDeEventos> findAllCreadorDeEventos();

    
    
}
