package com.projeto_final.app.controllers;

import com.projeto_final.app.models.*;
import com.projeto_final.app.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Autowired
    private PetRepository petRepository;
    
    @Autowired
    private VeterinarioRepository veterinarioRepository;
    
    @Autowired
    private ConsultaRepository consultaRepository;
    
    @RequestMapping("/")
    public String index(Model model) {
        // Estatísticas do sistema
        long totalPets = petRepository.count();
        long totalClientes = clienteRepository.count();
        long totalVeterinarios = veterinarioRepository.count();
        long totalConsultas = consultaRepository.count();
        
        // Consultas recentes (últimas 5)
        List<Consulta> consultasRecentes = consultaRepository.findAll(
            PageRequest.of(0, 5, Sort.by("data").descending())
        ).getContent();
        
        // Pets recentes (últimos 3)
        List<Pet> petsRecentes = petRepository.findAll(
            PageRequest.of(0, 3, Sort.by("idPet").descending())
        ).getContent();
        
        // Clientes recentes (últimos 2)
        List<Cliente> clientesRecentes = clienteRepository.findAll(
            PageRequest.of(0, 2, Sort.by("idCliente").descending())
        ).getContent();
        
        // Veterinários recentes (últimos 2)
        List<Veterinario> veterinariosRecentes = veterinarioRepository.findAll(
            PageRequest.of(0, 2, Sort.by("idVeterinario").descending())
        ).getContent();
        
        // Passando dados para o template
        model.addAttribute("totalPets", totalPets);
        model.addAttribute("totalClientes", totalClientes);
        model.addAttribute("totalVeterinarios", totalVeterinarios);
        model.addAttribute("totalConsultas", totalConsultas);
        model.addAttribute("consultasRecentes", consultasRecentes);
        model.addAttribute("petsRecentes", petsRecentes);
        model.addAttribute("clientesRecentes", clientesRecentes);
        model.addAttribute("veterinariosRecentes", veterinariosRecentes);
        
        return "index";
    }
    
    @GetMapping("/sobre")
    public String sobre() {
        return "sobre";
    }
    @GetMapping("/contato")
    public String contato() {
        return "contato";
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