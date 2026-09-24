package org.example.nivell3.exercici1.models;

public class FootballNews extends News{
    private String competition;
    private String club;
    private String player;


    public FootballNews(String title, String content, String competition, String club, String player) {
        super(title, content);

        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public void calculatePrice() {
        int price = 300;
        if (competition.equals("Lliga de Campions")) price += 100;
        if (club.equals("Barça") || club.equals("Madrid")) price += 100;
        if (player.equals("Ferran Torres") || player.equals("Benzema")) price += 50;

        super.setPrice(price);
    }

    @Override
    public void calculateScore() {
        int score = 5;
        if (competition.equals("Lliga de Campions")) score += 3;
        if (competition.equals("Lliga")) score += 2;
        if (club.equals("Barça") || club.equals("Madrid")) score += 2;
        if (player.equals("Ferran Torres") || player.equals("Benzema")) score += 1;

        super.setScore(score);
    }
}
