package org.example.nivell2.exercici1;

import org.example.nivell2.exercici1.interfaces.Camera;
import org.example.nivell2.exercici1.interfaces.Clock;

public class Smartphone extends Phone implements Camera, Clock {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    public void takePicture() { System.out.println("Taking a picture"); }
    public void triggerAlarm() { System.out.println("Triggering alarm"); }
}
