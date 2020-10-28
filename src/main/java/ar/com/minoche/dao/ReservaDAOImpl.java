package ar.com.minoche.dao;

import ar.com.minoche.domain.Reserva;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReservaDAOImpl implements ReservaDAO {

    Logger log = LogManager.getRootLogger();

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertReserva(Reserva reserva) {
        em.persist(reserva);
    }

    @Override
    public void updateReserva(Reserva reserva) {
        em.merge(reserva);
    }

    @Override
    public void deleteReserva(Reserva reserva) {
        em.remove(em.merge(reserva));
    }

    @Override
    public Reserva findReservaById(long id) {
        return em.find(Reserva.class, id);
    }

    @Override
    public List<Reserva> findAllReservas() {
        String jpql = "SELECT r FROM Reserva r";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }

    @Override
    public long contadorReservas() {
        String consulta = "select count (r) from reserva r";
        Query q = em.createQuery(consulta);
        return (long) q.getSingleResult();
    }

}
