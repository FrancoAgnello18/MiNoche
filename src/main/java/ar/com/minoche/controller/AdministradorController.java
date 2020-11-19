package ar.com.minoche.controller;

import ar.com.minoche.domain.Administrador;
import ar.com.minoche.service.AdministradorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/administrador")
public class AdministradorController {
    
    @Autowired
    private AdministradorService administradorService;
    
    @GetMapping("/")
    public String index(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("administradores", administradorService.listarAdministradores());
        return "modules/administrador/index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Administrador administrador){
        return "modules/administrador/modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Administrador administrador){
        administradorService.guardar(administrador);
        return "redirect:/administrador/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar (Administrador administrador, Model model){
        administrador = administradorService.encontrarAdministrador(administrador);
        model.addAttribute("cuenta", administrador);
        return "modules/administrador/modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Administrador administrador){
        administradorService.eliminar(administrador);
        return "redirect:/administrador/";
    }
}
