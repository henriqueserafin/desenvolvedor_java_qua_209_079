package com.projeto_final.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/sobre")
    public String sobre() {
        return "sobre";
    }
    
    // Redirecionamentos para as principais funcionalidades
    @GetMapping("/clientes")
    public String redirectClientes() {
        return "redirect:/clientes/listar";
    }
    
    @GetMapping("/pets")
    public String redirectPets() {
        return "redirect:/pets/listar";
    }
    
    @GetMapping("/veterinarios")
    public String redirectVeterinarios() {
        return "redirect:/veterinarios/listar";
    }
    
    @GetMapping("/consultas")
    public String redirectConsultas() {
        return "redirect:/consultas/listar";
    }
}