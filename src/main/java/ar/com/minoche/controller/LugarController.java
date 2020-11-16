package ar.com.minoche.controller;
import ar.com.minoche.domain.Lugar;
import ar.com.minoche.service.LugarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class LugarController {
    
    @Autowired
    private LugarService lugarService;
    
    @GetMapping("/")
    public String index(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("lugares", lugarService.listarLugares());
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Lugar lugar){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Lugar lugar){
        lugarService.guardar(lugar);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar (Lugar lugar, Model model){
        lugar = lugarService.encontrarLugar(lugar);
        model.addAttribute("lugar", lugar);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Lugar lugar){
        lugarService.eliminar(lugar);
        return "redirect:/";
    }
}
