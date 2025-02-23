package com.example;

public class Spotify implements Musica {
    private boolean tocando = false;

    @Override
    public void play() {
        if (!tocando) {
            tocando = true;
            System.out.println("Spotify: tocando.");
        } else {
            System.out.println("Spotify: A música já está tocando.");
        }
    }

    @Override
    public void pause() {
        if (tocando) {
            tocando = false;
            System.out.println("Spotify: pausada.");
        } else {
            System.out.println("Spotify: Nenhuma música está tocando.");
        }
    }

    @Override
    public void stop() {
        if (tocando) {
            tocando = false;
            System.out.println("Spotify: Reprodução parada.");
        } else {
            System.out.println("Spotify: Nenhuma música está tocando.");
        }
    }
}
