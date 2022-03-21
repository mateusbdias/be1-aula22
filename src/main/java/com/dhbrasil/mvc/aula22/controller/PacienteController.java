package com.dhbrasil.mvc.aula22.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class PacienteController {

    @GetMapping
    public String welcome(Model model) {
        model.addAttribute("nome", "Felipe");
        return "index";
    }

}
