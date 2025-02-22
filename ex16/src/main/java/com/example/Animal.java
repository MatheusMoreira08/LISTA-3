package com.example;

public interface Animal {
    void fazersom();

    default void dormir() {
        System.out.println("Zzz...:");
    }

}
