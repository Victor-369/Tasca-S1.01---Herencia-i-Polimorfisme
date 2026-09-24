package org.example.nivell3.exercici1.models;

public class TennisNews extends News {
    private String competition;
    private String player;


    public TennisNews(String title, String content, String player, String competition) {
        super(title, content);

        this.competition = competition;
        this.player = player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public void calculatePrice() {
        int price = 150;
        if (player.equals("Federer") || player.equals("Nadal") || player.equals("Djokovic")) price += 100;

        super.setPrice(price);
    }

    @Override
    public void calculateScore() {
        int score = 4;
        if (player.equals("Federer") || player.equals("Nadal") || player.equals("Djokovic")) score += 3;

        super.setScore(score);
    }
}
