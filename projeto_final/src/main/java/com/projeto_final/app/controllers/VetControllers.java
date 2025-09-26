
package com.projeto_final.app.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.projeto_final.app.repositories.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.projeto_final.app.models.Veterinario;

@Controller
public class VetControllers {
    @Autowired
    private VeterinarioRepository veterinarioRepository;
    @RequestMapping("/sobre")
    public String sobre() {
        return "sobre";

    }
    @RequestMapping("/pets")
    public String pets() {
        return "/pets/listar";

    }
    @RequestMapping("/clientes")
    public String clientes() {
        return "/clientes/listar";

    }
    @GetMapping("/veterinarios/listar")
    public String listarVeterinarios(Model model) {
        model.addAttribute("veterinarios", veterinarioRepository.findAll());
        return "veterinarios/listar";
    }
    @RequestMapping("/consultas")
    public String consultas() {

        return "/consultas/listar";
    }

    @GetMapping("/veterinarios/novo")
    public String novoVeterinario(Model model) {
        model.addAttribute("veterinario", new Veterinario());
        return "veterinarios/cadastrar";
    }


}
