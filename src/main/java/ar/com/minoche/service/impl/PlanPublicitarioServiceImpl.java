package ar.com.minoche.service.impl;

import ar.com.minoche.dao.PlanPublicitarioDAO;
import ar.com.minoche.domain.PlanPublicitario;
import ar.com.minoche.service.PlanPublicitarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlanPublicitarioServiceImpl implements PlanPublicitarioService{

    @Autowired
    private PlanPublicitarioDAO planpublicitarioDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<PlanPublicitario> listarPlanesPublicitarios() {
        return (List<PlanPublicitario>) planpublicitarioDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(PlanPublicitario planPublicitario) {
        planpublicitarioDAO.save(planPublicitario);
    }

    @Override
    @Transactional
    public void eliminar(PlanPublicitario planPublicitario) {
        planpublicitarioDAO.delete(planPublicitario);
    }

    @Override
    @Transactional
    public PlanPublicitario encontrarPlanPublicitario(PlanPublicitario planPublicitario) {
        return planpublicitarioDAO.findById(planPublicitario.getId()).orElse(null);
    }
    
}
