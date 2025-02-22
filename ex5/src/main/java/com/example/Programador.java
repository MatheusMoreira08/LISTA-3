package com.example;

public class Programador implements Funcionario {
    public double SalarioBase;
    public double Auxilio;

    public Programador(double SalarioBase, double Auxilio) {
        this.SalarioBase = SalarioBase;
        this.Auxilio = Auxilio;
    }

    @Override
    public double calcularSalario() {
        return SalarioBase + Auxilio;
    }
}
