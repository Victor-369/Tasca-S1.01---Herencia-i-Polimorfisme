package org.example.nivell1.exercici1;

import org.example.nivell1.exercici1.models.PercussionInstrument;
import org.example.nivell1.exercici1.models.StringInstrument;
import org.example.nivell1.exercici1.models.WindInstrument;

public class Main {
    static void main() {
        WindInstrument windInstrument = new WindInstrument();
        windInstrument.play();

        StringInstrument stringInstrument = new StringInstrument();
        stringInstrument.play();

        PercussionInstrument percussionInstrument = new PercussionInstrument();
        percussionInstrument.play();
    }

    static {
        System.out.println("Static block 1");
    }
}
