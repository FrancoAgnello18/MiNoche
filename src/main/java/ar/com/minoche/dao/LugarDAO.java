package ar.com.minoche.dao;

import ar.com.minoche.domain.Lugar;
import org.springframework.data.repository.CrudRepository;

public interface LugarDAO extends CrudRepository<Lugar, Long> {

    Lugar findLugarByNombre(String nombre);

    Lugar findLugarByEmail(String email);

    Lugar findLugarByTelefono(String telefono);

    Lugar findLugarByTipo(String tipo);

    Lugar findLugarByDomicilio(String domicilio);

    Lugar findLugarByLocalidad(String localidad);

    Lugar findLugarByProvincia(String provincia);

    Lugar findLugarByLocalizacion(String localizacion);

}
