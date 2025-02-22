package com.example;

public class Main {
    public static void main(String[] args) {
        Imprimivel documento = new Documento();
        Imprimivel imagem = new Imagem();

        documento.imprimir();
        imagem.imprimir();

    }
}