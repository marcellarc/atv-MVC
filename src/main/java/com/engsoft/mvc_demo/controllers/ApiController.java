package com.engsoft.mvc_demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engsoft.mvc_demo.models.Artista;
import com.engsoft.mvc_demo.models.Musica;

@RestController
@RequestMapping("/api/artistas")
public class ApiController {

    private List<Artista> artistas = new ArrayList<>();

    public ApiController() {
        Artista top = new Artista("Twenty One Pilots", "/img/top.jpg", "artista1");
        top.adicionarMusica(new Musica("Stressed Out", 202));
        top.adicionarMusica(new Musica("Ride", 214));
        top.adicionarMusica(new Musica("Doubt", 191));
        top.adicionarMusica(new Musica("Heathens", 195));
        top.adicionarMusica(new Musica("The Line", 192));

        Artista soad = new Artista("System of a Down", "/img/soad.jpg", "artista2");
        soad.adicionarMusica(new Musica("Chop Suey!", 210));
        soad.adicionarMusica(new Musica("Toxicity", 218));
        soad.adicionarMusica(new Musica("Aerials", 235));
        soad.adicionarMusica(new Musica("Lonely Day", 167));
        soad.adicionarMusica(new Musica("B.Y.O.B.", 255));

        Artista ptv = new Artista("Pierce The Veil", "/img/ptv.jpg", "artista3");
        ptv.adicionarMusica(new Musica("King For A Day", 236));
        ptv.adicionarMusica(new Musica("A Match Into Water", 212));
        ptv.adicionarMusica(new Musica("Bulls In The Bronx", 267));
        ptv.adicionarMusica(new Musica("Hell Above", 223));
        ptv.adicionarMusica(new Musica("Caraphernelia", 268));

        Artista paramore = new Artista("Paramore", "/img/para.png", "artista4");
        paramore.adicionarMusica(new Musica("Hard Times", 182));
        paramore.adicionarMusica(new Musica("Still into You", 216));
        paramore.adicionarMusica(new Musica("The Only Exception", 267));
        paramore.adicionarMusica(new Musica("Misery Business", 211));
        paramore.adicionarMusica(new Musica("Ain't It Fun", 296));

        Artista a7x = new Artista("Avenged Sevenfold", "/img/a7x.jpeg", "artista5");
        a7x.adicionarMusica(new Musica("Hail to the King", 305));
        a7x.adicionarMusica(new Musica("Nightmare", 374));
        a7x.adicionarMusica(new Musica("A Little Piece of Heaven", 480));
        a7x.adicionarMusica(new Musica("Afterlife", 352));
        a7x.adicionarMusica(new Musica("Dear God", 393));

        Artista bruno = new Artista("Bruno Mars", "/img/bruno.jpg", "artista6");
        bruno.adicionarMusica(new Musica("Marry You", 300));
        bruno.adicionarMusica(new Musica("Die With a Smile", 300));
        bruno.adicionarMusica(new Musica("Grenade", 300));
        bruno.adicionarMusica(new Musica("It Will Rain", 300));
        bruno.adicionarMusica(new Musica("Just The Way You Are", 300));

        artistas.add(top);
        artistas.add(soad);
        artistas.add(ptv);
        artistas.add(paramore);
        artistas.add(a7x);
        artistas.add(bruno);
    }

    @GetMapping
    public List<Artista> getArtistas() {
        return artistas;
    }
}
