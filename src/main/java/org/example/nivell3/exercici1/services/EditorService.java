package org.example.nivell3.exercici1.services;

import org.example.nivell3.exercici1.models.*;

import java.util.List;

public class EditorService {
    public static void addEditor(List<Editor> editors, Editor editor) {
        editors.add(editor);
    }

    private static void addNewsToEditor(List<Editor> editors, String dni, News news) {
        editors.stream()
                .filter(e -> e.getDni().equals(dni))
                .findFirst()
                .ifPresent(
                        editor -> editor.addNews(news)
                );
    }

    public static void removeEditor(List<Editor> editors, String dni) {
        Editor editorToDelete = editors.stream()
                .filter(e -> e.getDni().equals(dni))
                .findFirst()
                .orElseGet(() -> {
                    System.out.println("No editor was found with the specified DNI.");
                    return null;
                });

        editors.remove(editorToDelete);
    }

    public static void addFootballNewsToEditor(List<Editor> editors, String dni,
                                               String title, String text, String competition,
                                               String club, String player) {
        FootballNews footballNews = NewsService.createFootballNews(title, text, competition, club, player);

        addNewsToEditor(editors, dni, footballNews);
    }

    public static void addBasketballToEditor(List<Editor> editors, String dni,
                                             String title, String text, String competition,
                                             String club) {
        BasketballNews basketballNews = NewsService.createBasketballNews(title, text, competition, club);

        addNewsToEditor(editors, dni, basketballNews);
    }

    public static void addTennisToEditor(List<Editor> editors, String dni,
                                         String title, String text, String player) {
        TennisNews tennisNews = NewsService.createTennisNews(title, text, player);

        addNewsToEditor(editors, dni, tennisNews);
    }

    public static void addF1ToEditor(List<Editor> editors, String dni,
                                     String title, String text, String team) {
        F1News f1News = NewsService.createF1News(title, text, team);

        addNewsToEditor(editors, dni, f1News);
    }

    public static void addMotorcyclingToEditor(List<Editor> editors, String dni,
                                               String title, String text, String team) {
        MotorcyclingNews motorcyclingNews = NewsService.createMotorcyclingNews(title, text, team);

        addNewsToEditor(editors, dni, motorcyclingNews);
    }

    public static void removeStory(List<Editor> editors, String dni, String title) {
        editors.stream()
                .filter(e -> e.getDni().equals(dni))
                .findFirst()
                .ifPresent(
                        editor -> editor.removeNews(title)
                );
    }

    public static List<News> getAllStoriesFromEditor(List<Editor> editors, String dni) {
        return editors.stream()
                .filter(e -> e.getDni().equals(dni))
                .findFirst()
                .map(Editor::getAllNews)
                .orElse(List.of());
    }
}
