package com.example;

public class Geladeira implements Eletrodomestico {
    private boolean ligada;

    @Override
    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("Geladeira ligada.");
        } else {
            System.out.println("A geladeira já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("Geladeira ja desligada. ");
        } else {
            System.out.println("A geladeira já está desligada.");
        }
    }
}
