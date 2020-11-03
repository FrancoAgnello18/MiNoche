package ar.com.minoche.dao;

import ar.com.minoche.domain.Publicidad;
import org.springframework.data.repository.CrudRepository;

public interface PublicidadDAO extends CrudRepository <Publicidad, Long> {
    
    Publicidad findPublicidadByFlyer (int flyer);

}
