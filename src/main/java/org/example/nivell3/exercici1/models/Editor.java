package org.example.nivell3.exercici1.models;

public class Editor {
    private String name;
    private final String id;
    private static float salary;

    public Editor(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void setSalary(float salary) {
        Editor.salary = salary;
    }

    public String getId() {
        return id;
    }
}

