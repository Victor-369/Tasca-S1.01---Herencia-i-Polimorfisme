package org.example.nivell3.exercici1.models;

public class TennisNews extends News {
    private String player;


    public TennisNews(String title, String content, String player) {
        super(title, content);

        this.player = player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public void calculatePrice() {
        int price = 150;
        if (player.contains("Federer") || player.contains("Nadal") || player.contains("Djokovic")) price += 100;

        super.setPrice(price);
    }

    @Override
    public void calculateScore() {
        int score = 4;
        if (player.contains("Federer") || player.contains("Nadal") || player.contains("Djokovic")) score += 3;

        super.setScore(score);
    }
}
