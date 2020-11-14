package ar.com.minoche.dao;

import ar.com.minoche.domain.PlanPublicitario;
import org.springframework.data.repository.CrudRepository;

public interface PlanPublicitarioDAO extends CrudRepository<PlanPublicitario, Long> {

    PlanPublicitario findPlanPublicitarioByPrecio(Double precio);

    PlanPublicitario findPlanPublicitarioByDuracionDias(int duracion_dias);

    PlanPublicitario findPlanPublicitarioByAlcance(String alcance);

}
