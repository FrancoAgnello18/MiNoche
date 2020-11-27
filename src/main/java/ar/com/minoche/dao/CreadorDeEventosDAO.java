package ar.com.minoche.dao;

import ar.com.minoche.domain.CreadorDeEvento;
import org.springframework.data.repository.CrudRepository;

public interface CreadorDeEventosDAO extends CrudRepository<CreadorDeEvento, Long> {

    CreadorDeEvento findCreadorDeEventoByProvincia(String provincia);

    CreadorDeEvento findCreadorDeEventoByLocalidad(String localidad);

    CreadorDeEvento findCreadorDeEventoByDomicilio(String domicilio);

    CreadorDeEvento findCreadorDeEventoBySaldo(Double saldo);

//    
}
