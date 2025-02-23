package com.example;

public interface Repositorio<T> {
    void salvar(T objeto);
    T buscar(int id);
}   
