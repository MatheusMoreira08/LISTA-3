package com.example;

public class Geladeira implements Eletrodomestico {
    @Override
    public void ligar() {
        System.out.println("Ligando a geladeira");
    }
    
    @Override
    public void desligar() {
        System.out.println("Desligando a geladeira");
    }
}
