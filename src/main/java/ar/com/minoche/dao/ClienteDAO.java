package ar.com.minoche.dao;

import ar.com.minoche.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDAO extends CrudRepository<Cliente, Long> {

    Cliente findClienteBySexo(String saldo);

    Cliente findClienteByProvincia(String provincia);

    Cliente findClienteByLocalidad(String localidad);

    Cliente findClienteByDomicilio(String domicilio);

    Cliente findClienteByLocalizacion(String localizacion);

}
