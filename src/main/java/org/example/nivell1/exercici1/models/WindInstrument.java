package org.example.nivell1.exercici1.models;

public class WindInstrument extends Instrument {
    public WindInstrument(String name, float price ) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing");
    }
}
