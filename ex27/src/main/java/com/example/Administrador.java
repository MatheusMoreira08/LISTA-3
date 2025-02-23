package com.example;

public class Administrador implements Autenticavel {
    @Override
    public void login() {
        System.out.println("Administrador...login");
    }

    @Override
    public void logout() {
        System.out.println("Administrador...logout");
    }
}
