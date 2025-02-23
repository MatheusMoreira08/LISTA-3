package com.example;

public class Deezer implements Musica {
    private boolean tocando = false;

    @Override
    public void play() {
        if (!tocando) {
            tocando = true;
            System.out.println("Deezer: tocando.");
        } else {
            System.out.println("Deezer: A música já está tocando.");
        }
    }

    @Override
    public void pause() {
        if (tocando) {
            tocando = false;
            System.out.println("Deezer: pausada.");
        } else {
            System.out.println("Deezer: Nenhuma música está tocando.");
        }
    }

    @Override
    public void stop() {
        if (tocando) {
            tocando = false;
            System.out.println("Deezer: Reprodução parada.");
        } else {
            System.out.println("Deezer: Nenhuma música está tocando.");
        }
    }
}
