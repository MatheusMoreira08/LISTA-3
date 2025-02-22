package com.example;

public class Main {
    public static void main(String[] args) {
        Veiculo moto = new Moto();
        Veiculo carro = new Carro();

        carro.acelerar();
        moto.acelerar();
    }
}