package com.engsoft.mvc_demo.models;

public class Musica {

    String titulo, artista;
    int duracao;

    public Musica(String artista, String titulo, int duracao) {
        this.artista = artista;
        this.duracao = duracao;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

}
