package com.example;

public class UsuarioSistema implements Autenticavel {
    @Override
    public void login() {
        System.out.println("Sistema...login.");
    }

    @Override
    public void logout() {
        System.out.println("Sistema...logout");
    }
}
