package ar.com.minoche.controller;
import ar.com.minoche.domain.PlanPublicitario;
import ar.com.minoche.service.PlanPublicitarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/publicitario")
public class PlanPublicitarioController {
    @Autowired
    private PlanPublicitarioService planPublicitarioService;
    
    @GetMapping("/")
    public String index(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("publicitarios", planPublicitarioService.listarPlanesPublicitarios());
        return "modules/publicitario/index";
    }
    
    @GetMapping("/agregar")
    public String agregar(PlanPublicitario planPublicitario){
        return "modules/publicitario/modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(PlanPublicitario planPublicitario){
        planPublicitarioService.guardar(planPublicitario);
        return "redirect:/publicitario/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar (PlanPublicitario planPublicitario, Model model){
        planPublicitario = planPublicitarioService.encontrarPlanPublicitario(planPublicitario);
        model.addAttribute("planPublicitario", planPublicitario);
        return "modules/publicitario/modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(PlanPublicitario planPublicitario){
        planPublicitarioService.eliminar(planPublicitario);
        return "redirect:/publicitario/";
    }
}
