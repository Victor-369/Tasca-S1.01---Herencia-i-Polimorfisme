package org.example.nivell3.exercici1.models;

public abstract class News {
    private String title;
    private String text;
    private int score;
    private int price;

    public News(String title, String text) {
        this.title = title;
        this.text = text;
        this.score = 0;
        this.price = 0;
    }

    public String getTitle() { return title; }
    public String getText() {
        return text;
    }
    public int getScore() { return score; }
    public int getPrice() { return price; }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public abstract void calculatePrice();
    public abstract void calculateScore();
}
