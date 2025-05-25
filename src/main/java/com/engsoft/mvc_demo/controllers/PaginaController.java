package com.engsoft.mvc_demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.engsoft.mvc_demo.models.Artista;
import com.engsoft.mvc_demo.models.Musica;

@Controller
@RequestMapping("/")
public class PaginaController {

    private List<Artista> artistas = new ArrayList<>();

    public PaginaController() {
        List<Musica> musicasArtista1 = new ArrayList<>();
        musicasArtista1.add(new Musica("Stressed Out", "Twenty One Pilots", 202));
        musicasArtista1.add(new Musica("Ride", "Twenty One Pilots", 214));
        musicasArtista1.add(new Musica("Doubt", "Twenty One Pilots", 191));
        musicasArtista1.add(new Musica("Heathens", "Twenty One Pilots", 195));
        musicasArtista1.add(new Musica("The Line", "Twenty One Pilots", 192));

        List<Musica> musicasArtista2 = new ArrayList<>();
        musicasArtista2.add(new Musica("Chop Suey!", "System of a Down", 210));
        musicasArtista2.add(new Musica("Toxicity", "System of a Down", 218));
        musicasArtista2.add(new Musica("Aerials", "System of a Down", 235));
        musicasArtista2.add(new Musica("Lonely Day", "System of a Down", 167));
        musicasArtista2.add(new Musica("B.Y.O.B.", "System of a Down", 255));

        List<Musica> musicasArtista3 = new ArrayList<>();
        musicasArtista3.add(new Musica("King For A Day", "Pierce The Veil", 236));
        musicasArtista3.add(new Musica("A Match Into Water", "Pierce The Veil", 212));
        musicasArtista3.add(new Musica("Bulls In The Bronx", "Pierce The Veil", 267));
        musicasArtista3.add(new Musica("Hell Above", "Pierce The Veil", 223));
        musicasArtista3.add(new Musica("Caraphernelia", "Pierce The Veil", 268));

        List<Musica> musicasArtista4 = new ArrayList<>();
        musicasArtista4.add(new Musica("Hard Times", "Paramore", 182));
        musicasArtista4.add(new Musica("Still into You", "Paramore", 216));
        musicasArtista4.add(new Musica("The Only Exception", "Paramore", 267));
        musicasArtista4.add(new Musica("Misery Business", "Paramore", 211));
        musicasArtista4.add(new Musica("Ain't It Fun", "Paramore", 296));

        List<Musica> musicasArtista5 = new ArrayList<>();
        musicasArtista5.add(new Musica("Hail to the King", "Avenged Sevenfold", 305));
        musicasArtista5.add(new Musica("Nightmare", "Avenged Sevenfold", 374));
        musicasArtista5.add(new Musica("A Little Piece of Heaven", "Avenged Sevenfold", 480));
        musicasArtista5.add(new Musica("Afterlife", "Avenged Sevenfold", 352));
        musicasArtista5.add(new Musica("Dear God", "Avenged Sevenfold", 393));

        // Adicionando artistas com suas músicas
        artistas.add(new Artista("Twenty One Pilots", "/images/artista1.jpg", "artista1"));
        artistas.add(new Artista("System of a Down", "/images/artista2.jpg", "artista2"));
        artistas.add(new Artista("Pierce The Veil", "/images/artista3.jpg", "artista3"));
        artistas.add(new Artista("Paramore", "/images/artista4.png", "artista4"));
        artistas.add(new Artista("Avenged Sevenfold", "/images/artista5.jpeg", "artista5"));
    }

    @GetMapping
    public String home(Model model) {
        model.addAttribute("artistas", artistas);
        return "index";
    }

    @GetMapping("/artista/{pagina}")
    public String getPaginaArtista(@PathVariable String pagina) {
        return pagina; // retorna o nome da página, ex: "artista1" → artista1.html
    }
}
