package com.example.Curriculo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurriculoController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("nome", "Seu Nome");
        model.addAttribute("cargo", "Desenvolvedor Java");
        return "index";
    }
}
