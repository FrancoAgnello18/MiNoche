
package ar.com.minoche.service;

import ar.com.minoche.domain.Lugar;
import java.util.List;

public interface LugarService {
    List<Lugar> listarLugares();
    
    public void guardar (Lugar lugar);
    public void eliminar (Lugar lugar);
    public Lugar encontrarCuenta(Lugar lugar);
}
