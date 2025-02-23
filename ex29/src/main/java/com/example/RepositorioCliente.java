package com.example;

import java.util.HashMap;
import java.util.Map;

public class RepositorioCliente implements Repositorio<Cliente> {
    private Map<Integer, Cliente> clientes = new HashMap<>();

    @Override
    public void salvar(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
        System.out.println("Cliente salvo: " + cliente);
    }

    @Override
    public Cliente buscar(int id) {
        return clientes.getOrDefault(id, null);
    }
}
