package com.example;

public class Main {
    public static void main(String[] args) {
        Eletrodomestico televisao = new Televisao();
        Eletrodomestico geladeira = new Geladeira();

        televisao.ligar();
        televisao.desligar();
        geladeira.ligar();
        geladeira.desligar();
    }
}