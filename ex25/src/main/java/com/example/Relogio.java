package com.example;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Relogio implements Horario {
    @Override
    public String horarioAtual() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date agora = new Date();
        return sdf.format(agora);
    }
}
