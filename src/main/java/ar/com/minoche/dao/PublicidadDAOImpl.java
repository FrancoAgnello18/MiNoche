package ar.com.minoche.dao;

import ar.com.minoche.domain.Publicidad;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PublicidadDAOImpl implements PublicidadDAO {

    Logger log = LogManager.getRootLogger();

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertPublicidad(Publicidad publicidad) {
        em.persist(publicidad);
    }

    @Override
    public void updatePublicidad(Publicidad publicidad) {
        em.merge(publicidad);
    }

    @Override
    public void deletePublicidad(Publicidad publicidad) {
        em.remove(em.merge(publicidad));
    }

    @Override
    public Publicidad findPublicidadById(long id) {
        return em.find(Publicidad.class, id);
    }

    @Override
    public List<Publicidad> findAllPublicidades() {
        String jpql = "SELECT p FROM Publicidad p";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }

    @Override
    public long contadorPublicidades() {
        String consulta = "select count (p) from Publicidad p";
        Query q = em.createQuery(consulta);
        return (long) q.getSingleResult();
    }

}
