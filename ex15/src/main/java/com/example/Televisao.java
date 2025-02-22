package com.example;

public class Televisao implements ControleRemoto {

    @Override
    public void aumentarvolume() {
        System.out.println("Volume aumentando 25...30...35....40...+ :");
    }

    @Override
    public void diminuirvolume() {
        System.out.println("volume diminuindo 40...35...30...25...- :");
    }

}
