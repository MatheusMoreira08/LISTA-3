package com.example;

public class Documento implements Imprimivel {

    @Override
    public void imprimir() {
        System.out.println("Documento impresso");
    }
}
