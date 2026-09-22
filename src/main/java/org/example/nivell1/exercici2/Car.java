package org.example.nivell1.exercici2;

public class Car {
    static final String brand = "Mustang";
    static String model;
    final int power;

    public Car(int power) { this.power = power; }

    static void brake() { System.out.println("The vehicle is braking"); }
    public void accelerate() { System.out.println("The vehicle is accelerating"); }
}
