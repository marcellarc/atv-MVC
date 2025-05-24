package com.engsoft.mvc_demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.engsoft.mvc_demo.models.Artista;
import com.engsoft.mvc_demo.models.Musica;

@Controller
@RequestMapping("/")
public class PaginaController {

    private List<Artista> artistas = new ArrayList<>();

    public PaginaController() {
        // Criando músicas para o artista 1
        List<Musica> musicasArtista1 = new ArrayList<>();
        musicasArtista1.add(new Musica("Música A1", "Artista 1", 200));
        musicasArtista1.add(new Musica("Música A2", "Artista 1", 230));

        // Criando músicas para o artista 2
        List<Musica> musicasArtista2 = new ArrayList<>();
        musicasArtista2.add(new Musica("Música B1", "Artista 2", 180));
        musicasArtista2.add(new Musica("Música B2", "Artista 2", 210));

        // Adicionando artistas com suas músicas
        artistas.add(new Artista("Artista 1", "/images/artista1.jpg", musicasArtista1));
        artistas.add(new Artista("Artista 2", "/images/artista2.jpg", musicasArtista2));
    }

    @GetMapping
    public String home(Model model) {
        model.addAttribute("artistas", artistas);
        return "index"; 
    }
}