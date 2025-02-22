package com.example;

public class BancoDeDados implements Armazenavel {

    @Override
    public void salvar() {
        System.out.println("Banco salvo...:");
    }

    @Override
    public void carregar() {
        System.out.println("Carregando Banco de Dados...:");
    }

}
