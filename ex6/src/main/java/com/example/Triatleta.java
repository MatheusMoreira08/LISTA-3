package com.example;

public class Triatleta implements Corredor, Nadador {

    @Override
    public void correr() {
        System.out.println("etapa de corrida..:");
    }

    @Override
    public void nadar() {
        System.out.println("etapa de natacao");
    }

}
