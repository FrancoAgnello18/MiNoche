package ar.com.minoche.controller;
import ar.com.minoche.domain.Evento;
import ar.com.minoche.service.EventoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/evento")
public class EventoController {
    
    @Autowired
    private EventoService eventoService;
    
    @GetMapping("/")
    public String index(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("eventos", eventoService.listarEventos());
        return "modules/evento/index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Evento evento){
        return "modules/evento/modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar( Evento evento){        
        eventoService.guardar(evento);
        return "redirect:/evento/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar (Evento evento, Model model){
        evento = eventoService.encontrarEvento(evento);
        model.addAttribute("evento", evento);
        return "modules/evento/modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Evento evento){
        eventoService.eliminar(evento);
        return "redirect:/evento/";
    }
}
