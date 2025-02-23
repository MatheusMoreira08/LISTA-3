package com.example;

public class Main {
    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        int numero = 5;
        int fatorial = matematica.calculoFatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + fatorial);

    }
}