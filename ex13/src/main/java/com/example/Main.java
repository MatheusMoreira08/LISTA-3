package com.example;

public class Main {
    public static void main(String[] args) {
        Armazenavel arquivotexto = new ArquivoTexto();
        Armazenavel bancodedados = new BancoDeDados();

        arquivotexto.salvar();
        arquivotexto.carregar();
        bancodedados.salvar();
        bancodedados.carregar();
    }
}