package com.example;

public class Main {
    public static void main(String[] args) {
        Pagamento cartaocredito = new CartaoCredito();
        Pagamento boleto = new Boleto();

        cartaocredito.pagar();
        boleto.pagar();
    }
}