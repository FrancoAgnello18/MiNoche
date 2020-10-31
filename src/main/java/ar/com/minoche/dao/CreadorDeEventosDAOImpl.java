
package ar.com.minoche.dao;

import ar.com.minoche.domain.CreadorDeEventos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CreadorDeEventosDAOImpl implements CreadorDeEventosDAO{

    Logger log = LogManager.getRootLogger();

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertCreadorDeEventos(CreadorDeEventos creadorDeEventos) {
        em.persist(creadorDeEventos);
    }

    @Override
    public void updateCreadorDeEventos(CreadorDeEventos creadorDeEventos) {
        em.merge(creadorDeEventos);
    }

    @Override
    public void deleteCreadorDeEventos(CreadorDeEventos creadorDeEventos) {
        em.remove(em.merge(creadorDeEventos));
    }

    @Override
    public CreadorDeEventos findCreadorDeEventosById(long id) {
        return em.find(CreadorDeEventos.class, id);
    }

    @Override
    public List<CreadorDeEventos> findAllCreadorDeEventos() {
        String jpql = "SELECT c FROM CreadorDeEventos c";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }
    
}
