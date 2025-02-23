package com.example;

public class Main {
    public static void main(String[] args) {
        Temperatura temp = new Temperatura();
        double celsius = 31.0;
        double fahrenheit = temp.celsiusParaFahrenheit(celsius);
        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");
    }
}