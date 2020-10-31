package ar.com.minoche.dao;

import ar.com.minoche.domain.Lugar;
import java.util.List;

public interface LugarDAO {

    void insertLugar(Lugar lugar);

    void updateLugar(Lugar lugar);

    void deleteLugar(Lugar lugar);

    Lugar findLugarById(long id);

    List<Lugar> findAllLugares();

    long contadorLugares();

}
