package com.example.Curriculo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurriculoController {

    // Método que lida com a página inicial
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("nome", "Seu Nome");
        model.addAttribute("cargo", "Desenvolvedor Java");
        return "index"; // Retorna o template index.html (em src/main/resources/templates)
    }

    // NOVO MÉTODO PARA LER O currículo.html
    @GetMapping("/curriculo") // O Spring irá mapear a URL http://.../curriculo
    public String curriculo() {
        // Você pode adicionar um Model aqui se precisar passar dados, mas se for estático, não é necessário.
        return "curriculo"; // Retorna o template curriculo.html (em src/main/resources/templates)
    }

    @GetMapping("/projeto") // O Spring irá mapear a URL http://.../projeto
    public String projeto() {
        // Você pode adicionar um Model aqui se precisar passar dados, mas se for estático, não é necessário.
        return "projeto"; // Retorna o template curriculo.html (em src/main/resources/templates)

    }
}