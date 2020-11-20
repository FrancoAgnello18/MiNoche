package ar.com.minoche.controller;
import ar.com.minoche.domain.Pago;
import ar.com.minoche.service.PagoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/pago")
public class PagoController {
    
    @Autowired
    private PagoService pagoService;
    
    @GetMapping("/")
    public String index(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("pagos", pagoService.listarPagos());
        return "modules/pago/index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Pago pago){
        return "modules/pago/modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Pago pago){
        pagoService.guardar(pago);
        return "redirect:/pago/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar (Pago pago, Model model){
        pago = pagoService.encontrarPago(pago);
        model.addAttribute("pago", pago);
        return "modules/pago/modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Pago pago){
        pagoService.eliminar(pago);
        return "redirect:/pago/";
    }
}
