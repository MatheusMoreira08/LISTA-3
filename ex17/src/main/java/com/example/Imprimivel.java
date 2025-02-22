package com.example;

public interface Imprimivel {
    void imprimir();

    default void mostrarnomonitor() {
        System.out.println("Exibindo no monitor...: ");
    }

}
