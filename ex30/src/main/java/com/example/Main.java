package com.example;

public class Main {
    public static void main(String[] args) {
        Musica spotify = new Spotify();
        Musica deezer = new Deezer();

        spotify.play();
        spotify.pause();
        spotify.stop();
        spotify.stop();

        deezer.play();
        deezer.play(); 
        deezer.stop();
        deezer.pause(); 
    }
}