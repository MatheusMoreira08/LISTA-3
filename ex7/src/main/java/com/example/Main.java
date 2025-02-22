package com.example;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1000.0);
        conta.depositar(500.0);
        conta.sacar(200.0);
        System.out.println("Saldo atual: R$" + conta.verSaldo());
    }
}
