package org.example.nivell1.exercici1.models;

public class PercussionInstrument extends Instrument {
    public PercussionInstrument(String name, float price ) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Percussion instrument is playing");
    }
}
