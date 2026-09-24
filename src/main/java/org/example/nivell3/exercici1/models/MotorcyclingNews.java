package org.example.nivell3.exercici1.models;

public class MotorcyclingNews extends News {
    private String team;


    public MotorcyclingNews(String title, String content, String team) {
        super(title, content);

        this.team = team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public void calculatePrice() {
        int price = 100;
        if (team.equals("Honda") || team.equals("Yamaha")) price += 50;

        super.setPrice(price);
    }

    @Override
    public void calculateScore() {
        int score = 3;
        if (team.equals("Honda") || team.equals("Yamaha")) score += 2;

        super.setScore(score);
    }
}
