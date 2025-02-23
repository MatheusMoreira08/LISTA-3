package com.example;

public class Main {
    public static void main(String[] args) {
        Autenticavel usuariositema = new UsuarioSistema();
        Autenticavel administrador = new Administrador();

        usuariositema.login();
        usuariositema.logout();
        administrador.login();
        administrador.logout();
    }
}