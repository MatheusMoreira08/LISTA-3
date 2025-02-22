package com.example;

public class Main {
    public static void main(String[] args) {
        Pagamento cartaocredito = new CartaoCredito();
        Pagamento pix = new Pix();

        cartaocredito.pagamento();
        cartaocredito.cancelarpagamento();
        pix.pagamento();
        pix.cancelarpagamento();
    }
}