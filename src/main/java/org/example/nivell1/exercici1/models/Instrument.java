package org.example.nivell1.exercici1.models;

public abstract class Instrument {
    private String name;
    private Float price;

    public Instrument(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public abstract void play();
}
