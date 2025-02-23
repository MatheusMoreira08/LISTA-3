package com.example;

public interface Eletrodomestico {
     public void ligar();
     public void desligar();

     default void verificarEstado(boolean ligada) {
          System.out.println(ligada ? "O eletrodoméstico está ligado." : "O eletrodoméstico está desligado.");
     }
}
