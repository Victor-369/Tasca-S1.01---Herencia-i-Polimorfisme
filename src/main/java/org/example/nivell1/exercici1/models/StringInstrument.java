package org.example.nivell1.exercici1.models;

public class StringInstrument extends Instrument {
    public StringInstrument(String name, float price ) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Playing string instrument");
    }
}
