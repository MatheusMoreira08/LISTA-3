package com.example;

public class Boleto implements Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagamento negado....:");
    }
}
