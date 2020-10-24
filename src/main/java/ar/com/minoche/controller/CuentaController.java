package ar.com.minoche.controller;

import ar.com.minoche.domain.Cuenta;
import ar.com.minoche.service.CuentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cuentas") // http://localhost:8080/cuentas
public class CuentaController {
    
    @Autowired
    private CuentaService cuentaService;
    
    @GetMapping("/") // http://localhost:8080/cuentas/
    public String index(Model model) {
        List<Cuenta> cuentas = cuentaService.findAllCuentas();
        model.addAttribute("cuentas", cuentas);
        return "modules/cuentas/list"; //http://localhost:8080/cuentas/list
    }
    
}
