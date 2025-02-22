package com.example;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica quadrado = new Quadrado(5);
        FormaGeometrica circulo = new Circulo(3);

        System.out.println("Area do quadrado: " + quadrado.calcularArea());
        System.out.println("Area do circulo: " + circulo.calcularArea());
    }

}