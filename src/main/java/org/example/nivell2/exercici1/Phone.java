package org.example.nivell2.exercici1;

public class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(String number) {
        System.out.println("Calling to " + number);
    }
}
