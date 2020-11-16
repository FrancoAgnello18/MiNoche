package ar.com.minoche.controller;

import ar.com.minoche.domain.Cuenta;
import ar.com.minoche.service.CuentaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class CuentaController {
    
    @Autowired
    private CuentaService cuentaService;
    
    @GetMapping("/") // http://localhost:8080/cuentas/
    public String index(Model model) {
        //List<Cuenta> cuentas = cuentaService.listarCuenta();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("cuentas", cuentaService.listarCuentas());
        return "index"; //http://localhost:8080/cuentas/list
    }
    
    @GetMapping("/agregar")
    public String agregar(Cuenta cuenta){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Cuenta cuenta){
        cuentaService.guardar(cuenta);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar (Cuenta cuenta, Model model){
        cuenta = cuentaService.encontrarCuenta(cuenta);
        model.addAttribute("cuenta", cuenta);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Cuenta cuenta){
        cuentaService.eliminar(cuenta);
        return "redirect:/";
    }
}
