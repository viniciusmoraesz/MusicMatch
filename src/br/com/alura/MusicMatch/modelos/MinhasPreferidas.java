package br.com.alura.MusicMatch.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificao() >= 8){
            System.out.println(audio.getTitulo() + " É considerado sucesso absuluto e preferido entre os ouvintes");
        } else {
            System.out.println(audio.getTitulo() + " A galera também está curtindo!");
        }
    }
}
