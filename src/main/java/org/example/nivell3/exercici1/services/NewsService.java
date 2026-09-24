package org.example.nivell3.exercici1.services;

import org.example.nivell3.exercici1.models.*;

import java.util.List;
import java.util.Optional;

public class NewsService {
    public static FootballNews createFootballNews(String title, String text, String competition,
                                                  String club, String player) {
        return new FootballNews(title, text, competition, club, player);
    }

    public static BasketballNews createBasketballNews(String title, String text, String competition,
                                                      String club) {
        return new BasketballNews(title, text, competition, club);
    }

    public static TennisNews createTennisNews(String title, String text, String player, String competition) {
        return new TennisNews(title, text, player, competition);
    }

    public static F1News createF1News(String title, String text, String team) {
        return new F1News(title, text, team);
    }

    public static MotorcyclingNews createMotorcyclingNews(String title, String text, String team) {
        return new MotorcyclingNews(title, text, team);
    }

    public static Optional<Integer> calculateNewsScore(List<Editor> editors, String dni, String title) {
        return editors.stream()
                .filter(editor -> editor.getDni().equals(dni))
                .findFirst()
                .flatMap(editor -> editor.getAllNews().stream()
                        .filter(news -> news.getTitle().equals(title))
                        .findFirst())
                .map(news -> {
                    news.calculateScore();
                    return news.getScore();
                });
    }

    public static Optional<Integer> calculateNewsPrice(List<Editor> editors, String dni, String title) {
        return editors.stream()
                .filter(editor -> editor.getDni().equals(dni))
                .findFirst()
                .flatMap(editor -> editor.getAllNews().stream()
                        .filter(news -> news.getTitle().equals(title))
                        .findFirst())
                .map(news -> {
                    news.calculatePrice();
                    return news.getPrice();
                });
    }
}
