package com.microrecetas.usuarios.controller;

import com.microrecetas.usuarios.model.Receta;
import com.microrecetas.usuarios.service.RecetaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/recetas")
public class RecetasController {

    @Autowired
    private RecetaService recetaService;

    @GetMapping("/buscar")
    public Receta buscarRecetaPorNombre(@RequestParam(value = "nombre") String nombre) {
        Optional<Receta> recetaOptional = Optional.ofNullable(recetaService.buscarRecetaPorNombre(nombre));
        return recetaOptional.orElse(null); // Devuelve null si no se encuentra
    }
}