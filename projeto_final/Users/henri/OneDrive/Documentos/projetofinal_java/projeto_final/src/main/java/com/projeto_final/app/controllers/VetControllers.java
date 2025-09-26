package com.projeto_final.app.controllers;

import com.projeto_final.app.models.Veterinario;
import com.projeto_final.app.repositories.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/veterinarios")
public class VetControllers {
    
    @Autowired
    private VeterinarioRepository veterinarioRepository;

    // CRUD para Veterinários
    @GetMapping("/listar")
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("veterinarios/listar");
        Iterable<Veterinario> veterinarios = veterinarioRepository.findAll();
        mv.addObject("veterinarios", veterinarios);
        return mv;
    }

    @GetMapping("/form")
    public String formNovo(Model model) {
        model.addAttribute("veterinario", new Veterinario());
        return "veterinarios/form";
    }

    @GetMapping("/editar/{id}")
    public String formEditar(@PathVariable Long id, Model model) {
        Veterinario veterinario = veterinarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Veterinário inválido: " + id));
        model.addAttribute("veterinario", veterinario);
        return "veterinarios/form";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Veterinario veterinario, RedirectAttributes attrs) {
        veterinarioRepository.save(veterinario);
        attrs.addFlashAttribute("mensagem", "Veterinário salvo com sucesso!");
        return "redirect:/veterinarios/listar";
    }

    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id, RedirectAttributes attrs) {
        Veterinario veterinario = veterinarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Veterinário inválido: " + id));
        veterinarioRepository.delete(veterinario);
        attrs.addFlashAttribute("mensagem", "Veterinário deletado com sucesso!");
        return "redirect:/veterinarios/listar";
    }

    @GetMapping("/detalhes/{id}")
    public String detalhes(@PathVariable Long id, Model model) {
        Veterinario veterinario = veterinarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Veterinário inválido: " + id));
        model.addAttribute("veterinario", veterinario);
        return "veterinarios/detalhes";
    }

    @GetMapping("/buscar")
    public String buscar(@RequestParam String termo, Model model) {
        Iterable<Veterinario> veterinarios = veterinarioRepository.findByNomeContainingIgnoreCase(termo);
        model.addAttribute("veterinarios", veterinarios);
        model.addAttribute("termo", termo);
        return "veterinarios/listar";
    }
}