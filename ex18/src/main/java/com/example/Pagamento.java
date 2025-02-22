package com.example;

public interface Pagamento {
    void pagamento();

    default void cancelarpagamento() {
        System.out.println("Pagamento cancelado...:");
    }
}
