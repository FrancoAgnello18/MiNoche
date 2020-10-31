package ar.com.minoche.dao;

import ar.com.minoche.domain.Entrada;
import java.util.List;

public interface EntradaDAO {

    void insertEntrada(Entrada entrada);

    void updateEntrada(Entrada entrada);

    void deleteEntrada(Entrada entrada);

    Entrada findEntradaById(long id);

    List<Entrada> findAllEntradas();

    long contadorEntradas();

}
