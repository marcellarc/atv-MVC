package com.engsoft.mvc_demo.models;

public class Musica {

    private String titulo;
    private int duracaoEmSegundos;

    public Musica(String titulo, int duracaoEmSegundos) {
        this.titulo = titulo;
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

}
