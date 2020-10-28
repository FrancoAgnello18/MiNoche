package ar.com.minoche.dao;

import ar.com.minoche.domain.PlanPublicitario;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlanPublicitarioDAOImpl implements PlanPublicitarioDAO {

    Logger log = LogManager.getRootLogger();

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertPlanPublicitario(PlanPublicitario planPublicitario) {
        em.persist(planPublicitario);
    }

    @Override
    public void updatePlanPublicitario(PlanPublicitario planPublicitario) {
        em.merge(planPublicitario);
    }

    @Override
    public void deletePlanPublicitario(PlanPublicitario planPublicitario) {
        em.remove(em.merge(planPublicitario));
    }

    @Override
    public PlanPublicitario findPlanPublicitarioById(long id) {
        return em.find(PlanPublicitario.class, id);
    }

    @Override
    public List<PlanPublicitario> findAllPlanPublicitario() {
        String jpql = "SELECT p FROM PlanPublicitario p";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }

    @Override
    public long contadorPlanPublicitario() {
        String consulta = "select count (p) from PlanPublicitario p";
        Query q = em.createQuery(consulta);
        return (long) q.getSingleResult();
    }

}
