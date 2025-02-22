package com.example;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrair(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
        try {
            System.out.println("Divisão: " + calc.dividir(10, 5));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
