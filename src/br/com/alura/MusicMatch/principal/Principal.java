package br.com.alura.MusicMatch.principal;

import br.com.alura.MusicMatch.modelos.MinhasPreferidas;
import br.com.alura.MusicMatch.modelos.Musica;
import br.com.alura.MusicMatch.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        //CRIANDO UMA MÚSICA
        Musica peaches = new Musica();
        peaches.setTitulo("Peaches");
        peaches.setGenero("Pop");
        peaches.setArtista("Justin Bieber");
        peaches.setAlbum("Justice");

        for (int i = 0; i <2000 ; i++) {
            peaches.reproduz();
        }

        for (int i = 0; i < 300; i++) {
            peaches.curte();
        }

        int curtidasPeaches = peaches.getTotalCurtidas();
        int reproducoesPeaches = peaches.getTotalReproducoes();

        System.out.println("O total de curtidas da música Peaches é: " + curtidasPeaches);
        System.out.println("O total de reproduções da música Peaches é: " + reproducoesPeaches);

        peaches.getClassificao();

        //CRIANDO UM PODCAST
        Podcast flowSportClub = new Podcast();
        flowSportClub.setTitulo("Flow Sport Club");
        flowSportClub.setDescricao("Podcast que abrange diversos assuntos relacionados a esportes (futebol é o principal)");
        flowSportClub.setHost("Cross");

        for (int i = 0; i <10000 ; i++) {
            flowSportClub.reproduz();
        }

        for (int i = 0; i < 2000; i++) {
            flowSportClub.curte();
        }

        int curtidasFlowSportClub = flowSportClub.getTotalCurtidas();
        int reproducoesFlowSportClub = flowSportClub.getTotalReproducoes();

        flowSportClub.getClassificao();

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(peaches);
        minhasPreferidas.inclui(flowSportClub);
    }
}
