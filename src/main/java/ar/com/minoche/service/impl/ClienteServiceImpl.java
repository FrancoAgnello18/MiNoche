package ar.com.minoche.service.impl;

import ar.com.minoche.dao.ClienteDAO;
import ar.com.minoche.domain.Cliente;
import ar.com.minoche.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteDAO clienteDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> listarClientes() {
        return (List<Cliente>) clienteDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Cliente cliente) {
        clienteDAO.save(cliente);
    }

    @Override
    @Transactional
    public void eliminar(Cliente cliente) {
        clienteDAO.delete(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente encontrarCliente(Cliente cliente) {
        return clienteDAO.findById(cliente.getId()).orElse(null);
    }
}