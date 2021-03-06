package ar.com.minoche.controller;
import ar.com.minoche.domain.Persona;
import ar.com.minoche.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/persona")
public class PersonaController {
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")
    public String index(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personaService.listarPersonas());
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modules/persona/modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Persona persona){
        personaService.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar (Persona persona, Model model){
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Persona persona){
        personaService.eliminar(persona);
        return "redirect:/";
    }
}
