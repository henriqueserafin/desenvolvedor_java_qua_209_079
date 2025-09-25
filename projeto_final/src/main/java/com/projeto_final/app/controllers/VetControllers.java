package com.projeto_final.app.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetControllers {
    @RequestMapping("/")
    public String index() {
        return "index";

    }
    @RequestMapping("/sobre")
    public String sobre() {
        return "sobre";

    }

}
