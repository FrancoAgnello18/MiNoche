
package ar.com.minoche.dao;

import ar.com.minoche.domain.Evento;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class EventoDAOImpl implements EventoDAO {
    
    Logger log = LogManager.getRootLogger();

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertEvento(Evento evento) {
        em.persist(evento);
    }

    @Override
    public void updateEvento(Evento evento) {
        em.merge(evento);
    }

    @Override
    public void deleteEvento(Evento evento) {
        em.remove(em.merge(evento));
    }

    @Override
    public Evento findEventoById(long id) {
         return em.find(Evento.class, id);
    }

    @Override
    public List<Evento> findAllEventos() {
        String jpql = "SELECT e FROM Evento e";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }

    @Override
    public long contadorEventos() {
        String consulta = "select count (e) from Evento e";
        Query q = em.createQuery(consulta);
        return (long) q.getSingleResult();
    }
    
}
