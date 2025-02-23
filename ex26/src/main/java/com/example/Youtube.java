package com.example;

public class Youtube implements Transmissivel {
    @Override
    public void iniciarTransmissao() {
        System.out.println("Ligando live no YT");
    }

    @Override
    public void finalizarTransmissao() {
        System.out.println("Finalizando live no YT");
    }
}
