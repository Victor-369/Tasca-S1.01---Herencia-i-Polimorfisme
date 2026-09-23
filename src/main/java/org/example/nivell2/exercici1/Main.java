package org.example.nivell2.exercici1;

import org.example.nivell2.exercici1.interfaces.Camera;
import org.example.nivell2.exercici1.interfaces.Clock;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Nokia", "6410");

        Phone phone = smartphone;
        phone.call(786453211);

        Camera camera = smartphone;
        camera.takePicture();

        Clock clock = smartphone;
        clock.triggerAlarm();
    }
}
