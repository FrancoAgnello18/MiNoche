package ar.com.minoche.controller;
import ar.com.minoche.domain.Reserva;
import ar.com.minoche.service.ReservaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ReservaController {
    @Autowired
    private ReservaService reservaService;
    
    @GetMapping("/")
    public String index(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("reservas", reservaService.listarReservas());
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Reserva reserva){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Reserva reserva){
        reservaService.guardar(reserva);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idReserva}")
    public String editar (Reserva reserva, Model model){
        reserva = reservaService.encontrarReserva(reserva);
        model.addAttribute("reserva", reserva);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Reserva reserva){
        reservaService.eliminar(reserva);
        return "redirect:/";
    }
    
    
}
