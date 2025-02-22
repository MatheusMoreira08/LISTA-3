package com.example;

public class Main {
    public static void main(String[] args) {
        Jogavel xadrez = new Xadrez();
        Jogavel futebol = new Futebol();

        xadrez.iniciarjogo();
        futebol.iniciarjogo();
    }
}