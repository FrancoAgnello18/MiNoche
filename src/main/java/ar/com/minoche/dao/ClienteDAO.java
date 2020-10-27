
package ar.com.minoche.dao;

import ar.com.minoche.domain.Cliente;
import java.util.List;


public interface ClienteDAO {

    void insertCliente(Cliente cliente);

    void updateCliente(Cliente cliente);

    void deleteCliente(Cliente cliente);

    Cliente findClienteById(long id);

    List<Cliente> findAllCliente();

    long contadorCliente();

}
