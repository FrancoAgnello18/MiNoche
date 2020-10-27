package ar.com.minoche.dao;

import ar.com.minoche.domain.Cuenta;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CuentaDAOImpl implements CuentaDAO {

    Logger log = LogManager.getRootLogger();

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertCuenta(Cuenta cuenta) {
        em.persist(cuenta);

    }

    @Override
    public void updateCuenta(Cuenta cuenta) {
        em.merge(cuenta);
    }

    @Override
    public void deleteCuenta(Cuenta cuenta) {
        em.remove(em.merge(cuenta));
    }

    @Override
    public Cuenta findCuentaById(long id) {
        return em.find(Cuenta.class, id);
    }

    @Override
    public List<Cuenta> findAllCuentas() {
        String jpql = "SELECT c FROM Cuenta c";
        Query query = em.createQuery(jpql);
        return query.getResultList();

    }

    @Override
    public long contadorCuentas() {
        String consulta = "select count (c) from Cuenta c";
        Query q = em.createQuery(consulta);
        return (long) q.getSingleResult();

    }

}
