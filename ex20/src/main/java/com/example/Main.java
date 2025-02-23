package com.example;

public class Main {
    public static void main(String[] args) {
        Eletrodomestico televisao = new Televisao();
        Eletrodomestico geladeira = new Geladeira();
        Eletrodomestico microondas = new Microondas();

        televisao.ligar();
        televisao.desligar();
        geladeira.ligar();
        geladeira.desligar();
        microondas.ligar();
        microondas.desligar();
    }
}