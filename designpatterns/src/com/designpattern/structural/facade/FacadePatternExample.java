package com.designpattern.structural.facade;

public class FacadePatternExample {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
