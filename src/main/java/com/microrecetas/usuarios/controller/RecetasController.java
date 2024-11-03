package com.microrecetas.usuarios.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecetasController {
    
    @RequestMapping("recetas")
    public String greetings(@RequestParam(value="name", defaultValue="World") String name) {
        return "Proximo detalle de";
    }
}
