package com.example;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca conta = new  ContaPoupanca("Mazio", 222000);
        System.out.println("Saldo inical de: " + conta.getSaldo());

        conta.depositar(3550);
        System.out.println("Saldo apos deposito: " + conta.getSaldo());

        conta.sacar(100000);
        System.out.println("Saldo apos saque: " + conta.getSaldo());
        System.out.println("Taxa de juros: " + conta.taxaJuros() * 100 + "% ao anoo");
    }
}