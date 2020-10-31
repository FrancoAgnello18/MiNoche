package ar.com.minoche.dao;

import ar.com.minoche.domain.Pago;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PagoDAOImpl implements PagoDAO {

    Logger log = LogManager.getRootLogger();

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertPago(Pago pago) {
        em.persist(pago);
    }

    @Override
    public void updatePago(Pago pago) {
        em.merge(pago);
    }

    @Override
    public void deletePago(Pago pago) {
        em.remove(em.merge(pago));
    }

    @Override
    public Pago findPagoById(long id) {
        return em.find(Pago.class, id);
    }

    @Override
    public List<Pago> findAllPagos() {
        String jpql = "SELECT p FROM Pago p";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }

    @Override
    public long contadorPagos() {
        String consulta = "select count (p) from Pago p";
        Query q = em.createQuery(consulta);
        return (long) q.getSingleResult();
    }

}
