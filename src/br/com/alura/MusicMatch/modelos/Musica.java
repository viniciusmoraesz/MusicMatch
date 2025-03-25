package br.com.alura.MusicMatch.modelos;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificao() {
        if (getTotalCurtidas() > 200) {
            return 10;
        }
        else if (getTotalCurtidas() > 100){
            return 8;
            }
         else {
            return 6;
        }
    }
}
