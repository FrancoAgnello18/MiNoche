package ar.com.minoche.controller;
import ar.com.minoche.domain.Entrada;
import ar.com.minoche.service.EntradaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class EntradaController {
    
    @Autowired
    private EntradaService entradaService;
    
    @GetMapping("/")
    public String index(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("entradas", entradaService.listarEntradas());
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Entrada entrada){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Entrada entrada){
        entradaService.guardar(entrada);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idEntrada}")
    public String editar (Entrada entrada, Model model){
        entrada = entradaService.encontrarEntrada(entrada);
        model.addAttribute("entrada", entrada);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Entrada entrada){
        entradaService.eliminar(entrada);
        return "redirect:/";
    }
}
