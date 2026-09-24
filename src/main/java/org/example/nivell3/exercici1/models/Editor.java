package org.example.nivell3.exercici1.models;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private String name;
    private final String dni;
    private static float salary = 1500;
    private List<News> newsList;


    public Editor(String id, String editorName) {
        dni = id;
        name = editorName;
        newsList = new ArrayList<>();
    }

    public String getDni() { return dni; }
    public void setSalary(float newSalary) { salary = newSalary; }

    public void addNews(News news) { newsList.add(news); }
    public List<News> getAllNews() { return List.copyOf(newsList); }
    public boolean removeNews(String title) {
        return newsList.removeIf(n -> n.getTitle().equals(title));
    }
}

