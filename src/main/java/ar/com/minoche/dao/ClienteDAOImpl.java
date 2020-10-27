/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.minoche.dao;

import ar.com.minoche.domain.Cliente;
import java.util.List;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClienteDAOImpl implements ClienteDAO {

    Logger log = LogManager.getRootLogger();

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertCliente(Cliente cliente) {
        em.persist(cliente);
    }

    @Override
    public void updateCliente(Cliente cliente) {
        em.merge(cliente);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        em.remove(em.merge(cliente));
    }

    @Override
    public Cliente findClienteById(long id) {
        return em.find(Cliente.class, id);
    }

    @Override
    public List<Cliente> findAllCliente() {
        String jpql = "SELECT c FROM Cliente c";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }

    @Override
    public long contadorCliente() {
        String consulta = "select count (c) from Cliente c";
        Query q = em.createQuery(consulta);
        return (long) q.getSingleResult();
    }

}
