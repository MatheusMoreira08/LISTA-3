package com.example;

public class Temperatura implements Conversor {
    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}   
