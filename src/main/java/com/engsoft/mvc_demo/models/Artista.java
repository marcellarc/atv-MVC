package com.engsoft.mvc_demo.models;

import java.util.ArrayList;
import java.util.List;

public class Artista {

    private String nome;
    private String imagemUrl;
    private String pagina;
    private List<Musica> musicas = new ArrayList<>();

    public Artista(String nome, String imagemUrl, String pagina) {
        this.nome = nome;
        this.imagemUrl = imagemUrl;
        this.pagina = pagina;
    }

    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public String getPagina() {
        return pagina;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
}
