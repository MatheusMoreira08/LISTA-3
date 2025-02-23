package com.example;

public class Main {
    public static void main(String[] args) {
        RepositorioCliente repositorio = new RepositorioCliente();

        Cliente cliente1 = new Cliente(1, "João");
        Cliente cliente2 = new Cliente(2, "Maria");

        repositorio.salvar(cliente1);
        repositorio.salvar(cliente2);

        Cliente c1 = repositorio.buscar(1);
        Cliente c2 = repositorio.buscar(2);
        Cliente c3 = repositorio.buscar(3); 

        System.out.println("Cliente encontrado: " + (c1 != null ? c1 : "Não encontrado"));
        System.out.println("Cliente encontrado: " + (c2 != null ? c2 : "Não encontrado"));
        System.out.println("Cliente encontrado: " + (c3 != null ? c3 : "Não encontrado"));
    }
}