package com.engsoft.mvc_demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.engsoft.mvc_demo.models.Musica;

@Controller
@RequestMapping("/musicas")
public class PaginaController {

    public List<Musica> musicas = new ArrayList<Musica>();

    public PaginaController() {
        musicas.add(new Musica("musica 1", "artista 1", 300));
    }

    @GetMapping
    public String getMusicas(Model model) {
        model.addAttribute("musicas", musicas);
        return "musicas";
    }

}
