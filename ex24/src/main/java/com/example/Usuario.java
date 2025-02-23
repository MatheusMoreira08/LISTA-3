package com.example;

public class Usuario implements Mensagem {
    @Override
    public String exibirMensagem() {
        return "Bem-vindo ao sistema!";
    }
}
