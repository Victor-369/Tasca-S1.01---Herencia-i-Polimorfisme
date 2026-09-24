package org.example.nivell3.exercici1.models;

public class BasketballNews extends News {
    private String competition;
    private String club;


    public BasketballNews(String title, String content, String competition, String club) {
        super(title, content);

        this.competition = competition;
        this.club = club;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public void calculatePrice() {
        int price = 250;
        if (competition.contains("Lliga de Campions")) price += 75;
        if (club.contains("Barça") || club.contains("Madrid")) price += 75;

        super.setPrice(price);
    }

    @Override
    public void calculateScore() {
        int score = 4;
        if (competition.equals("Eurolliga")) score += 3;
        if (competition.equals("ACB")) score += 2;
        if (club.equals("Barça") || club.equals("Madrid")) score += 1;

        super.setScore(score);
    }
}
