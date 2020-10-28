package ar.com.minoche.dao;

import ar.com.minoche.domain.Publicidad;
import java.util.List;

public interface PublicidadDAO {

    void insertPublicidad(Publicidad publicidad);

    void updatePublicidad(Publicidad publicidad);

    void deletePublicidad(Publicidad publicidad);

    Publicidad findPublicidadById(long id);

    List<Publicidad> findAllPublicidades();

    long contadorPublicidades();

}
