package com.example;

public class Robo implements Movivel {
    private int posicao;

    public Robo() {
        this.posicao = 0;
    }

    @Override
    public void moverFrente() {
        posicao++;
        System.out.println("Movendo pra frente, ficando na posicao: " + posicao);
    }

    @Override
    public void moverTras() {
        posicao--;
        System.out.println("Movendo pra tras, ficando na posicao: " + posicao);
    }

    public int getPosicao() {
        return posicao;
    }
}
