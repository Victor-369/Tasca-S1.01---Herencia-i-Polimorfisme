package org.example.nivell1.exercici2;

public class Main {
    static void main(String[] args) {
        Car.brake();

        Car car1 = new Car(150);
        Car car2 = new Car(250);
        System.out.println("Potencia car1: " + car1.power);
        System.out.println("Potencia car2: " + car2.power);

        Car.model = "BMW";
        System.out.println("Modelo car1: " + car1.model);
        System.out.println("Modelo car2: " + car2.model);


        Car.model = "Ferrari";
        System.out.println("Modelo car1: " + car1.model);
        System.out.println("Modelo car2: " + car2.model);

        car1.accelerate();
    }
}
