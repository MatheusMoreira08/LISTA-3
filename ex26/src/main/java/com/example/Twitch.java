package com.example;

public class Twitch implements Transmissivel {
    @Override
    public void iniciarTransmissao() {
        System.out.println("Ligando live na TW");
    }

    @Override
    public void finalizarTransmissao() {
        System.out.println("Finalizando live na TW");
    }
}
