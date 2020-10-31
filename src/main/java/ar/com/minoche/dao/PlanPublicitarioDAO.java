package ar.com.minoche.dao;

import ar.com.minoche.domain.PlanPublicitario;
import java.util.List;

public interface PlanPublicitarioDAO {

    void insertPlanPublicitario(PlanPublicitario planPublicitario);

    void updatePlanPublicitario(PlanPublicitario planPublicitario);

    void deletePlanPublicitario(PlanPublicitario planPublicitario);

    PlanPublicitario findPlanPublicitarioById(long id);

    List<PlanPublicitario> findAllPlanPublicitario();

    long contadorPlanPublicitario();

}
