package com.example;

public class Main {
    public static void main(String[] args) {
        Transmissivel youtube = new Youtube();
        Transmissivel twitch = new Twitch();

        youtube.iniciarTransmissao();
        youtube.finalizarTransmissao();
        twitch.iniciarTransmissao();
        twitch.finalizarTransmissao();
    }
}