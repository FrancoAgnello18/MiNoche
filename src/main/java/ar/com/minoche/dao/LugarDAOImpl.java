package ar.com.minoche.dao;

import ar.com.minoche.domain.Lugar;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LugarDAOImpl implements LugarDAO {

    Logger log = LogManager.getRootLogger();

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertLugar(Lugar lugar) {
        em.persist(lugar);
    }

    @Override
    public void updateLugar(Lugar lugar) {
        em.merge(lugar);
    }

    @Override
    public void deleteLugar(Lugar lugar) {
        em.remove(em.merge(lugar));
    }

    @Override
    public Lugar findLugarById(long id) {
        return em.find(Lugar.class, id);
    }

    @Override
    public List<Lugar> findAllLugares() {
        String jpql = "SELECT l FROM Lugar l";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }

    @Override
    public long contadorLugares() {
        String consulta = "select count (l) from Lugar l";
        Query q = em.createQuery(consulta);
        return (long) q.getSingleResult();
    }

}
