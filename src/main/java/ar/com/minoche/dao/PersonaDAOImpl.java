package ar.com.minoche.dao;

import ar.com.minoche.domain.Persona;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersonaDAOImpl implements PersonaDAO {

    Logger log = LogManager.getRootLogger();

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        em.remove(em.merge(persona));
    }

    @Override
    public Persona findPersonaById(long id) {
        return em.find(Persona.class, id);
    }

    @Override
    public List<Persona> findAllPersonas() {
        String jpql = "SELECT p FROM Persona p";
        Query query = em.createQuery(jpql);
        return query.getResultList();
    }

    @Override
    public long contadorPersonas() {
        String consulta = "select count (p) from Persona p";
        Query q = em.createQuery(consulta);
        return (long) q.getSingleResult();
    }

}
