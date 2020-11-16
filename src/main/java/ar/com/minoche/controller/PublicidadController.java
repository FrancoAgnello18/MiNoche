package ar.com.minoche.controller;
import ar.com.minoche.domain.Publicidad;
import ar.com.minoche.service.PublicidadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class PublicidadController {
    
    @Autowired
    private PublicidadService publicidadService;
    
    @GetMapping("/")
    public String index(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("publicidades", publicidadService.listarPublicidades());
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Publicidad publicidad){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Publicidad publicidad){
        publicidadService.guardar(publicidad);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idPublicidad}")
    public String editar (Publicidad publicidad, Model model){
        publicidad = publicidadService.encontrarPublicidad(publicidad);
        model.addAttribute("publicidad", publicidad);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Publicidad publicidad){
        publicidadService.eliminar(publicidad);
        return "redirect:/";
    }
}
