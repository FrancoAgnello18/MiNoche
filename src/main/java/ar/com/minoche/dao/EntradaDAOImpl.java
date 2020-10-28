package ar.com.minoche.dao;

import ar.com.minoche.domain.Entrada;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntradaDAOImpl implements EntradaDAO {

    Logger log = LogManager.getRootLogger();

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertEntrada(Entrada entrada) {
        em.persist(entrada);
    }

    @Override
    public void updateEntrada(Entrada entrada) {
        em.merge(entrada);

    }

    @Override
    public void deleteEntrada(Entrada entrada) {
        em.remove(em.merge(entrada));
    }

    @Override
    public Entrada findEntradaById(long id) {
        return em.find(Entrada.class, id);
    }

    @Override
    public List<Entrada> findAllEntradas() {
        String jpql = "SELECT e FROM Entrada e";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }

    @Override
    public long contadorEntradas() {
        String consulta = "select count (e) from Entrada e";
        Query q = em.createQuery(consulta);
        return (long) q.getSingleResult();
    }

}
