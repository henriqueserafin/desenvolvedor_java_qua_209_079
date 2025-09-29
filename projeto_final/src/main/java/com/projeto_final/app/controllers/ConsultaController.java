
package com.projeto_final.app.controllers;

import com.projeto_final.app.models.Consulta;
import com.projeto_final.app.models.Cliente;
import com.projeto_final.app.models.Pet;
import com.projeto_final.app.models.Veterinario;
import com.projeto_final.app.repositories.ConsultaRepository;
import com.projeto_final.app.repositories.ClienteRepository;
import com.projeto_final.app.repositories.PetRepository;
import com.projeto_final.app.repositories.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/consultas")
public class ConsultaController {
    
    @Autowired
    private ConsultaRepository consultaRepository;
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Autowired
    private PetRepository petRepository;
    
    @Autowired
    private VeterinarioRepository veterinarioRepository;

    @GetMapping("/listar")
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("consultas/listar");
        Iterable<Consulta> consultas = consultaRepository.findAll();
        mv.addObject("consultas", consultas);
        return mv;
    }

    @GetMapping("/novo")
    public String formNovo(Model model) {
        model.addAttribute("consulta", new Consulta());
        Iterable<Cliente> clientes = clienteRepository.findAll();
        Iterable<Pet> pets = petRepository.findAll();
        Iterable<Veterinario> veterinarios = veterinarioRepository.findAll();
        model.addAttribute("clientes", clientes);
        model.addAttribute("pets", pets);
        model.addAttribute("veterinarios", veterinarios);
    return "consultas/cadastrar";
    }

    @GetMapping("/editar/{id}")
    public String formEditar(@PathVariable Long id, Model model) {
        Consulta consulta = consultaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Consulta inválida: " + id));
        model.addAttribute("consulta", consulta);
        Iterable<Cliente> clientes = clienteRepository.findAll();
        Iterable<Pet> pets = petRepository.findAll();
        Iterable<Veterinario> veterinarios = veterinarioRepository.findAll();
        model.addAttribute("clientes", clientes);
        model.addAttribute("pets", pets);
        model.addAttribute("veterinarios", veterinarios);
    return "consultas/cadastrar";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Consulta consulta,
                        @RequestParam Long cliente,
                        @RequestParam Long pet,
                        @RequestParam Long veterinario,
                        RedirectAttributes attrs) {
        Cliente clienteObj = clienteRepository.findById(cliente)
                .orElseThrow(() -> new IllegalArgumentException("Cliente inválido: " + cliente));
        Pet petObj = petRepository.findById(pet)
                .orElseThrow(() -> new IllegalArgumentException("Pet inválido: " + pet));
        Veterinario veterinarioObj = veterinarioRepository.findById(veterinario)
                .orElseThrow(() -> new IllegalArgumentException("Veterinário inválido: " + veterinario));

        consulta.setCliente(clienteObj);
        consulta.setPet(petObj);
        consulta.setVeterinario(veterinarioObj);

        consultaRepository.save(consulta);
        attrs.addFlashAttribute("mensagem", "Consulta salva com sucesso!");
        return "redirect:/consultas/listar";
    }

    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id, RedirectAttributes attrs) {
        Consulta consulta = consultaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Consulta inválida: " + id));
        consultaRepository.delete(consulta);
        attrs.addFlashAttribute("mensagem", "Consulta deletada com sucesso!");
        return "redirect:/consultas/listar";
    }

    @GetMapping("/detalhes/{id}")
    public String detalhes(@PathVariable Long id, Model model) {
        Consulta consulta = consultaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Consulta inválida: " + id));
        model.addAttribute("consulta", consulta);
        return "consultas/detalhes";
    }

    @GetMapping("/agenda")
    public ModelAndView agenda() {
        ModelAndView mv = new ModelAndView("consultas/agenda");
        Iterable<Consulta> consultas = consultaRepository.findConsultasFuturas(LocalDateTime.now());
        mv.addObject("consultas", consultas);
        return mv;
    }

    @GetMapping("/cliente/{idCliente}")
    public ModelAndView consultasPorCliente(@PathVariable Long idCliente) {
        ModelAndView mv = new ModelAndView("consultas/listar");
        Cliente cliente = clienteRepository.findById(idCliente)
                .orElseThrow(() -> new IllegalArgumentException("Cliente inválido: " + idCliente));
        Iterable<Consulta> consultas = consultaRepository.findByCliente(cliente);
        mv.addObject("consultas", consultas);
        mv.addObject("cliente", cliente);
        return mv;
    }

    @GetMapping("/veterinario/{idVeterinario}")
    public ModelAndView consultasPorVeterinario(@PathVariable Long idVeterinario) {
        ModelAndView mv = new ModelAndView("consultas/listar");
        Veterinario veterinario = veterinarioRepository.findById(idVeterinario)
                .orElseThrow(() -> new IllegalArgumentException("Veterinário inválido: " + idVeterinario));
        Iterable<Consulta> consultas = consultaRepository.findByVeterinario(veterinario);
        mv.addObject("consultas", consultas);
        mv.addObject("veterinario", veterinario);
        return mv;
    }

}