package com.example;

public class Gerente implements Funcionario {
    public double SalarioBase;
    public double Comissao;

    public Gerente(double SalarioBase, double Comissao) {
        this.SalarioBase = SalarioBase;
        this.Comissao = Comissao;
    }

    @Override
    public double calcularSalario() {
        return SalarioBase + Comissao;
    }

}
