
package ar.com.minoche.service;

import ar.com.minoche.domain.Cliente;
import java.util.List;

public interface ClienteService {
    List<Cliente> listarClientes();
    
    public void guardar (Cliente cliente);
    public void eliminar (Cliente cliente);
    public Cliente encontrarCliente(Cliente cliente);
}
