package com.example;

public class Main {
    public static void main(String[] args) {
        Robo robo = new Robo();
        
       
        robo.moverFrente();
        robo.moverFrente();
        robo.moverFrente();
        robo.moverTras();
        
        System.out.println("Posicaoo final do Robo: " + robo.getPosicao());
    }
}