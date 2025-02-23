package com.example;

public class Televisao implements Eletrodomestico {
    private boolean ligada;
    
    @Override
    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("Televisao ligada.");
        } else {
            System.out.println("A Televisao já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("Televisao ja desligada. ");
        } else {
            System.out.println("A Televisao já está desligada.");
        }
    }
}
