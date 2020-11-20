package ar.com.minoche.controller;
import ar.com.minoche.domain.Reserva;
import ar.com.minoche.service.ReservaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/reserva")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;
    
    @GetMapping("/")
    public String index(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("reservas", reservaService.listarReservas());
        return "modules/reserva/index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Reserva reserva){
        return "modules/reserva/modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Reserva reserva){
        reservaService.guardar(reserva);
        return "redirect:/reserva/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar (Reserva reserva, Model model){
        reserva = reservaService.encontrarReserva(reserva);
        model.addAttribute("reserva", reserva);
        return "modules/reserva/modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Reserva reserva){
        reservaService.eliminar(reserva);
        return "redirect:/reserva/";
    }
    
    
}
