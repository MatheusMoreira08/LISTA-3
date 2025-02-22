package com.example;

public class CartaoCredito implements Pagamento {
    
    @Override
    public void pagar() {
        System.out.println("Pagamento concluido...:");
    }
}
