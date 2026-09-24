package org.example.nivell3.exercici1.models;

public class F1News extends News {
    private String team;


    public F1News(String title, String content, String team) {
        super(title, content);

        this.team = team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public void calculatePrice() {
        int price = 100;
        if (team.equals("Ferrari") || team.equals("Mercedes")) price += 50;

        super.setPrice(price);
    }

    @Override
    public void calculateScore() {
        int score = 4;
        if (team.equals("Ferrari") || team.equals("Mercedes")) score += 2;

        super.setScore(score);
    }
}
