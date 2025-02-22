package com.example;

public class Main {
    public static void main(String[] args) {
       Funcionario gerente = new Gerente(13000, 1050);
       Funcionario programador = new Programador(10000, 800);


       System.out.println("Salario do gerente: " + gerente.calcularSalario());
       System.out.println("Salario do programador: " + programador.calcularSalario());
    }
}