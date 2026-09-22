package org.example.nivell3.exercici1.utils;

import org.example.nivell3.exercici1.models.Editor;
import org.example.nivell3.exercici1.models.News;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EditorManage {
    public static Editor fillEditorData(Scanner scanner) {
        String name;
        String id;

        System.out.print("Write name: ");
        name = scanner.nextLine();

        System.out.print("Write ID: ");
        id = scanner.nextLine();

        return new Editor(id, name);
    }

    public static void removeEditor(Scanner scanner, List<Editor> editors) {
        String id;

        System.out.print("Write editor's ID: ");
        id = scanner.nextLine();

        editors.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .ifPresentOrElse(
                        editors::remove,
                        () -> System.out.println("Editor doesn't exists")
                );
    }

    public static void addStoryToEditor(Scanner scanner, List<News> news) {
        System.out.print("Choose type of news (Futbol, Bàsquet, Tenis, F1, Motociclisme): ");
        String typeNews = scanner.nextLine();

        System.out.print("Write title of news: ");
        String title = scanner.nextLine();

        System.out.print("Write ID of editor: ");
        String idEditor = scanner.nextLine();

        System.out.print("Write content of this news: ");
        String content = scanner.nextLine();

        News newNews = new News(typeNews, title, idEditor);

        news.add(newNews);
        System.out.println("News added");
    }

    public static void removeStory(Scanner scanner, List<News> news) {
        System.out.print("Write ID of editor: ");
        String idEditor = scanner.nextLine();

        System.out.print("Write title of news: ");
        String newsTitle = scanner.nextLine();

        news.stream()
                .filter(n -> n.getIdEditor().equals(idEditor) && n.getTitle().equals(newsTitle))
                .findFirst()
                .ifPresentOrElse(
                        news::remove,
                        () -> System.out.println("News does not exists")
                );
    }

    public static void showAllStoriesFromEditor(Scanner scanner, List<News> news) {
        System.out.print("Write ID of editor: ");
        String idEditor = scanner.nextLine();

        List<News> newsOfEditor = news.stream()
                .filter(n -> n.getIdEditor().equals(idEditor))
                .toList();

        for (News n : newsOfEditor) {
            System.out.println("Title: " + n.getTitle());
            System.out.println("Content: " + n.getContent());
        }
    }
}
