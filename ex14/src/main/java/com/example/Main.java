package com.example;

public class Main {
    public static void main(String[] args) {
        Sensores sensordetemperatura = new SensorDeTemperatura();
        Sensores sensordepressao = new SensorDePressao();

        sensordetemperatura.medirtemperatura();
        sensordepressao.medirtemperatura();
    }
}