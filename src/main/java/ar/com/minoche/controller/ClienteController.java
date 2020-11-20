package ar.com.minoche.controller;

import ar.com.minoche.domain.Cliente;
import ar.com.minoche.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/")
    public String index(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("clientes", clienteService.listarClientes());
        return "modules/cliente/index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Cliente cliente){
        return "modules/cliente/modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Cliente cliente){
        clienteService.guardar(cliente);
        return "redirect:/cliente/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar (Cliente cliente, Model model){
        cliente = clienteService.encontrarCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "modules/cliente/modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Cliente cliente){
        clienteService.eliminar(cliente);
        return "redirect:/cliente/";
    }
}