package com.example;

public class Microondas implements Eletrodomestico {
    private boolean ligada;

    @Override
    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("Microondas ligado.");
        } else {
            System.out.println(" Microondas já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("Microondas ja desligado. ");
        } else {
            System.out.println(" Microondas já está desligado.");
        }
    }
}
