package ar.com.minoche.service;

import ar.com.minoche.domain.Publicidad;
import java.util.List;

public interface PublicidadService {
    List<Publicidad> listarPublicidades();
    
    public void guardar (Publicidad publicidad);
    public void eliminar (Publicidad publicidad);
    public Publicidad encontrarPublicidad(Publicidad publicidad);
}
