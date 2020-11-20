package ar.com.minoche.controller;
import ar.com.minoche.domain.CreadorDeEvento;
import ar.com.minoche.service.CreadorDeEventoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/creador")
public class CreadorDeEventoController {
    
    @Autowired
    private CreadorDeEventoService creadorDeEventoService;
    
    @GetMapping("/")
    public String index(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("creadores", creadorDeEventoService.listarCreadoresDeEventos());
        return "modules/creador/index";
    }
    
    @GetMapping("/agregar")
    public String agregar(CreadorDeEvento creadorDeEvento){
        return "modules/creador/modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(CreadorDeEvento creadorDeEvento){
        creadorDeEventoService.guardar(creadorDeEvento);
        return "redirect:/creador/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar (CreadorDeEvento creadorDeEvento, Model model){
        creadorDeEvento = creadorDeEventoService.encontrarCreadorDeEvento(creadorDeEvento);//esta mal el metodo en CreadorDeEventoService
        model.addAttribute("creadorDeEvento", creadorDeEvento);
        return "modules/creador/modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(CreadorDeEvento creadorDeEvento){
        creadorDeEventoService.eliminar(creadorDeEvento);
        return "redirect:/creador/";
    }
}
