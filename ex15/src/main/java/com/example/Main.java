package com.example;

public class Main {
    public static void main(String[] args) {
        ControleRemoto televisao = new Televisao();

        televisao.aumentarvolume();
        televisao.diminuirvolume();
    }
}