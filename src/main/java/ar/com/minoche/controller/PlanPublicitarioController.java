package ar.com.minoche.controller;
import ar.com.minoche.domain.PlanPublicitario;
import ar.com.minoche.service.PlanPublicitarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class PlanPublicitarioController {
    @Autowired
    private PlanPublicitarioService planPublicitarioService;
    
    @GetMapping("/")
    public String index(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("PlanesPublicitarios", planPublicitarioService.listarPlanesPublicitarios());
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(PlanPublicitario planPublicitario){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(PlanPublicitario planPublicitario){
        planPublicitarioService.guardar(planPublicitario);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idPlanPublicitario}")
    public String editar (PlanPublicitario planPublicitario, Model model){
        planPublicitario = planPublicitarioService.encontrarPlanPublicitario(planPublicitario);
        model.addAttribute("planPublicitario", planPublicitario);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(PlanPublicitario planPublicitario){
        planPublicitarioService.eliminar(planPublicitario);
        return "redirect:/";
    }
}
