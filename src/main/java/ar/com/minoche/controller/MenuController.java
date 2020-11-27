package ar.com.minoche.controller;

import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j

public class MenuController {
   
    @RequestMapping(value="/menu")
    public String index(Model model) {
        return "modules/home/Home";
    }
    
}