
package ar.com.minoche.dao;

import ar.com.minoche.domain.Persona;
import java.util.List;


public interface PersonaDAO {
    
    void insertPersona(Persona persona);

    void updatePersona(Persona persona);

    void deletePersona(Persona persona);

    Persona findPersonaById(long id);

    List<Persona> findAllPersonas();

    long contadorPersonas();
    
}
