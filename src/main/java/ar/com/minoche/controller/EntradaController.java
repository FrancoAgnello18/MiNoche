package ar.com.minoche.controller;
import ar.com.minoche.domain.Entrada;
import ar.com.minoche.service.EntradaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/entrada")
public class EntradaController {
    
    @Autowired
    private EntradaService entradaService;
    
    @GetMapping("/")
    public String index(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("entradas", entradaService.listarEntradas());
        return "modules/entrada/index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Entrada entrada) {
        return "modules/entrada/modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Entrada entrada){
        entradaService.guardar(entrada);
        return "redirect:/entrada/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar (Entrada entrada, Model model){
        entrada = entradaService.encontrarEntrada(entrada);
        model.addAttribute("entrada", entrada);
        return "modules/entrada/modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Entrada entrada){
        entradaService.eliminar(entrada);
        return "redirect:/entrada/";
    }
}
