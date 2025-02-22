package com.example;

public class CartaoCredito implements Pagamento {

    @Override
    public void pagamento() {
        System.out.println("Realizando pagamento...:");
    }

}
