package ar.com.minoche.dao;

import ar.com.minoche.domain.Entrada;
import org.springframework.data.repository.CrudRepository;

public interface EntradaDAO extends CrudRepository<Entrada, Long> {

    Entrada findEntradaByCodQr(String cod_qr);

    Entrada findEntradaByPrecio(String precio);

}
