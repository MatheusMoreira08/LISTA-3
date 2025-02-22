package com.example;

public class ArquivoTexto implements Armazenavel {

    @Override
    public void salvar() {
        System.out.println("Arquivo salvo...:");
    }

    @Override
    public void carregar() {
        System.out.println("Carregando arquivo...:");
    }
}
