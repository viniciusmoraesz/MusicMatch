package br.com.alura.MusicMatch.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificao() {
        return classificao;
    }

    public void curte(){
        totalCurtidas++;
    }

    public void reproduz(){
        totalReproducoes++;
    }
}
