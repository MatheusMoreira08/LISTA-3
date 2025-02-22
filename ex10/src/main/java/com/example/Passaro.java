package com.example;

public class Passaro implements Animal, Voador {

    @Override
    public void comer() {
        System.out.println("comendo...:");
    }

    @Override
    public void voar() {
        System.out.println("voando...:");
    }

}
