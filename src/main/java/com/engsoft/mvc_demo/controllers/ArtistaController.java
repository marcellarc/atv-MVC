package com.engsoft.mvc_demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.engsoft.mvc_demo.models.Artista;

@Controller
@RequestMapping("/artistas")
public class ArtistaController {

    private List<Artista> artistas = new ArrayList<>();

    public ArtistaController() {
        artistas.add(new Artista("Twenty One Pilots", "/images/artista1.jpg", "artista1"));
        artistas.add(new Artista("System of a Down", "/images/artista2.jpg", "artista2"));
        artistas.add(new Artista("Pierce The Veil", "/images/artista3.jpg", "artista3"));
        artistas.add(new Artista("Paramore", "/images/artista4.png", "artista4"));
        artistas.add(new Artista("Avenged Sevenfold", "/images/artista5.jpeg", "artista5"));
    }

    @GetMapping
     public String getArtistas(Model model) {
        model.addAttribute("artistas", artistas);
        return "artistas";
    }

}