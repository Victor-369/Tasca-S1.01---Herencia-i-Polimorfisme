package org.example.nivell3.exercici1.utils;

import org.example.nivell3.exercici1.models.News;

import java.util.List;
import java.util.Scanner;

public class NewsManage {
    public static void getNewsToCalculatePrice(Scanner scanner, List<News> news) {
        System.out.print("Write ID of editor: ");
        String idEditor = scanner.nextLine();

        System.out.print("Write title of news to calculate price: ");
        String title = scanner.nextLine();

        news.stream()
                .filter(n -> n.getIdEditor().equals(idEditor) && n.getTitle().equals(title))
                .findFirst()
                .ifPresentOrElse(
                        n -> calculatePrice(n),
                        () -> System.out.println("News does not exists")
                );
    }

    public static void getNewsToCalculateScore(Scanner scanner, List<News> news) {
        System.out.print("Write ID of editor: ");
        String idEditor = scanner.nextLine();

        System.out.print("Write title of news to calculate price: ");
        String title = scanner.nextLine();

        news.stream()
                .filter(n -> n.getIdEditor().equals(idEditor) && n.getTitle().equals(title))
                .findFirst()
                .ifPresentOrElse(
                        n -> calculateScore(n),
                        () -> System.out.println("News does not exists")
                );
    }



    public static void calculatePrice(News news) {
        String content = news.getContent();
        float price = 0;

        switch (news.getType()) {
            case "Futbol" -> {
                price = 300;
                if (content.contains("Lliga de Campions")) price += 100;
                if (content.contains("Barça") || content.contains("Madrid")) price += 100;
                if (content.contains("Ferran Torres") || content.contains("Benzema")) price += 50;
            }

            case "Bàsquet" -> {
                price = 250;
                if (content.contains("Eurolliga")) price += 75;
                if (content.contains("Barça") || content.contains("Madrid")) price += 75;
            }

            case "Tenis" -> {
                price = 150;
                if (content.contains("Federer") || content.contains("Nadal") || content.contains("Djokovic"))
                    price += 100;
            }

            case "F1" -> {
                price = 100;
                if (content.contains("Ferrari") || content.contains("Mercedes")) price += 50;
            }

            case "Motociclisme" -> {
                price = 100;
                if (content.contains("Honda") || content.contains("Yamaha")) price += 50;
            }
        }

        news.setPrice(price);
    }

    public static void calculateScore(News news) {
        String content = news.getContent();
        float score = 0;

        switch (news.getType()) {
            case "Futbol" -> {
                score = 5;
                if (content.contains("Lliga de Campions")) score += 3;
                if (content.contains("Lliga")) score += 2;
                if (content.contains("Barça") || content.contains("Madrid")) score += 2;
                if (content.contains("Ferran Torres") || content.contains("Benzema")) score += 1;
            }

            case "Bàsquet" -> {
                score = 4;
                if (content.contains("Eurolliga")) score += 3;
                if (content.contains("ACB")) score += 2;
                if (content.contains("Barça") || content.contains("Madrid")) score += 1;
            }

            case "Tenis" -> {
                score = 4;
                if (content.contains("Federer") || content.contains("Nadal") || content.contains("Djokovic"))
                    score += 3;
            }

            case "F1" -> {
                score = 4;
                if (content.contains("Ferrari") || content.contains("Mercedes")) score += 2;
            }

            case "Motociclisme" -> {
                score = 3;
                if (content.contains("Honda") || content.contains("Yamaha")) score += 3;
            }
        }

        news.setScore(score);
    }
}
