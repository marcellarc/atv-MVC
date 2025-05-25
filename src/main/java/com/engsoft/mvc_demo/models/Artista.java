package com.engsoft.mvc_demo.models;

import java.util.List;

public class Artista {

    private String nome;
    private String imagemUrl;
    private List<Musica> musicas;
    private String pagina;

    public Artista(String nome, String imagemUrl, String pagina) {
        this.nome = nome;
        this.imagemUrl = imagemUrl;
        this.pagina = pagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

}
