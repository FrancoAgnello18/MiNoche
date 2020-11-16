
package ar.com.minoche.service;

import ar.com.minoche.domain.Administrador;
import java.util.List;

public interface AdministradorService {
    List<Administrador> listarAdministradores();
    
    public void guardar (Administrador administrador);
    public void eliminar (Administrador administrador);
    public Administrador encontrarAdministrador(Administrador administrador);
}
