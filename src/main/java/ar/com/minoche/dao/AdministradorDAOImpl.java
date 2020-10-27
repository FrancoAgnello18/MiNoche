/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.minoche.dao;

import ar.com.minoche.domain.Administrador;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdministradorDAOImpl implements AdministradorDAO {

    Logger log = LogManager.getRootLogger();

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertAdministrador(Administrador administrador) {
        em.persist(administrador);

    }

    @Override
    public void updateAdministrador(Administrador administrador) {
        em.merge(administrador);
    }

    @Override
    public void deleteAdministrador(Administrador administrador) {
        em.remove(em.merge(administrador));

    }

    @Override
    public Administrador findAdministradorById(long id) {
        return em.find(Administrador.class, id);
    }

    @Override
    public List<Administrador> findAllAdministrador() {
        String jpql = "SELECT a FROM Administrador a";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }

    @Override
    public long contadorAdministrador() {
        String consulta = "select count (a) from Administrador a";
        Query q = em.createQuery(consulta);
        return (long) q.getSingleResult();
    }

}
