package ar.com.minoche.dao;

import ar.com.minoche.domain.Administrador;
import java.util.List;

public interface AdministradorDAO {

    void insertAdministrador(Administrador administrador);

    void updateAdministrador(Administrador administrador);

    void deleteAdministrador(Administrador administrador);

    Administrador findAdministradorById(long id);

    List<Administrador> findAllAdministrador();

    long contadorAdministrador();

}
