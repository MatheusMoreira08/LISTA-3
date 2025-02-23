package com.example;

public class ContaPoupanca implements Banco {
    private double  saldo;
    private String titular;
    private static final double TAXA_JUROS = 0.04;

    public ContaPoupanca(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public double taxaJuros() {
        return TAXA_JUROS;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor ) {
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
