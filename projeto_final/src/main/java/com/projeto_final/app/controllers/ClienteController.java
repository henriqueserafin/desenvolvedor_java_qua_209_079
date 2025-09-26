package com.projeto_final.app.controllers;

import com.projeto_final.app.models.Cliente;
import com.projeto_final.app.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/listar")
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("clientes/listar");
        Iterable<Cliente> clientes = clienteRepository.findAll();
        mv.addObject("clientes", clientes);
        return mv;
    }

    // Changed from "/form" to "/novo"
    @GetMapping("/novo")
    public String formNovo(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "clientes/cadastrar";
    }

    @GetMapping("/editar/{id}")
    public String formEditar(@PathVariable Long id, Model model) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente inválido: " + id));
        model.addAttribute("cliente", cliente);
        return "clientes/cadastrar";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Cliente cliente, RedirectAttributes attrs) {
        clienteRepository.save(cliente);
        attrs.addFlashAttribute("mensagem", "Cliente salvo com sucesso!");
        return "redirect:/clientes/listar";
    }

    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id, RedirectAttributes attrs) {
        clienteRepository.deleteById(id);
        attrs.addFlashAttribute("mensagem", "Cliente deletado com sucesso!");
        return "redirect:/clientes/listar";
    }

    @GetMapping("/detalhes/{id}")
    public String detalhes(@PathVariable Long id, Model model) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente inválido: " + id));
        model.addAttribute("cliente", cliente);
        return "clientes/detalhes";
    }

    @GetMapping("/buscar")
    public String buscar(@RequestParam String termo, Model model) {
        Iterable<Cliente> clientes = clienteRepository.findByNomeContainingIgnoreCase(termo);
        model.addAttribute("clientes", clientes);
        return "clientes/listar";
    }
}