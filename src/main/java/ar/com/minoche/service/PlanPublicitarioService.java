package ar.com.minoche.service;

import ar.com.minoche.domain.PlanPublicitario;
import java.util.List;

public interface PlanPublicitarioService {
    List<PlanPublicitario> listarPlanesPublicitarios();
    
    public void guardar (PlanPublicitario planPublicitario);
    public void eliminar (PlanPublicitario planPublicitario);
    public PlanPublicitario encontrarPlanPublicitario(PlanPublicitario planPublicitario);
}
