package org.example.nivell1.exercici1;

import org.example.nivell1.exercici1.models.Instrument;
import org.example.nivell1.exercici1.models.PercussionInstrument;
import org.example.nivell1.exercici1.models.StringInstrument;
import org.example.nivell1.exercici1.models.WindInstrument;

public class Main {
    public static void main() {
        Instrument[] instruments = {
                new PercussionInstrument("Drum", 210),
                new StringInstrument("Guitar", 300),
                new WindInstrument("Flute", 130)
        };

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    static {
        System.out.println("Static block 1");
    }
}
