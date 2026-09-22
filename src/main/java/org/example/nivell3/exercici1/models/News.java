package org.example.nivell3.exercici1.models;

public class News {
    private String typeNews;
    private String title;
    private String content;
    private float score;
    private float price;

    public News(String typeNews, String title, int score) {
        this.typeNews = typeNews;
        this.title = title;
        this.content = null;
        this.score = 0;        // Pending to fill, like a null
        this.price = 0;        // Pending to fill, like a null
    }


    public void calculateNewsPrice(String typeNews, String content) {
        switch (typeNews) {
            case "Futbol" -> {
                this.price = 300;
                if (this.content.contains("Lliga de Campions")) this.price += 100;
                if (this.content.contains("Barça") || this.content.contains("Madrid")) this.price += 100;
                if (this.content.contains("Ferran Torres") || this.content.contains("Benzema")) this.price += 50;
            }

            case "Bàsquet" -> {
                this.price = 250;
                if (this.content.contains("Eurolliga")) this.price += 75;
                if (this.content.contains("Barça") || this.content.contains("Madrid")) this.price += 75;
            }

            case "Tenis" -> {
                this.price = 150;
                if (this.content.contains("Federer") || this.content.contains("Nadal") || this.content.contains("Djokovic")) this.price += 100;
            }

            case "F1" -> {
                this.price = 100;
                if (this.content.contains("Ferrari") || this.content.contains("Mercedes")) this.price += 50;
            }

            case "Motociclisme" -> {
                this.price = 100;
                if (this.content.contains("Honda") || this.content.contains("Yamaha")) this.price += 50;
            }
        }
    }

    public void calculateScore() {
        switch (this.typeNews) {
            case "Futbol" -> {
                this.score = 5;
                if (this.content.contains("Lliga de Campions")) this.score += 3;
                if (this.content.contains("Lliga")) this.score += 2;
                if (this.content.contains("Barça") || this.content.contains("Madrid")) this.score += 2;
                if (this.content.contains("Ferran Torres") || this.content.contains("Benzema")) this.score += 1;
            }

            case "Bàsquet" -> {
                this.score = 4;
                if (this.content.contains("Eurolliga")) this.score += 3;
                if (this.content.contains("ACB")) this.score += 2;
                if (this.content.contains("Barça") || this.content.contains("Madrid")) this.score += 1;
            }

            case "Tenis" -> {
                this.score = 4;
                if (this.content.contains("Federer") || this.content.contains("Nadal") || this.content.contains("Djokovic")) this.score += 3;
            }

            case "F1" -> {
                this.score = 4;
                if (this.content.contains("Ferrari") || this.content.contains("Mercedes")) this.score += 2;
            }

            case "Motociclisme" -> {
                this.score = 3;
                if (this.content.contains("Honda") || this.content.contains("Yamaha")) this.score += 3;
            }
        }
    }
}
