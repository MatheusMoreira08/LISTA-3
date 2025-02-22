package com.example;

public class Main {
    public static void main(String[] args) {
        InstrumentoMusical violao = new Violao();
        InstrumentoMusical piano = new Piano();

        piano.tocar();
        violao.tocar();
        
    }
}