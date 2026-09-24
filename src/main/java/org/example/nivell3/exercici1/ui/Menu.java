package org.example.nivell3.exercici1.ui;

import org.example.nivell3.exercici1.models.Editor;
import org.example.nivell3.exercici1.models.News;
import org.example.nivell3.exercici1.services.EditorService;
import org.example.nivell3.exercici1.services.NewsService;

import java.util.*;

public class Menu {
    public static void showMenu(List<Editor> editors) {
        Scanner scanner = new Scanner(System.in);

        int option = -1;
        while (option != 0) {
            System.out.println("1. Add editor");
            System.out.println("2. Remove editor");
            System.out.println("3. Add story to an editor");
            System.out.println("4. Remove story (requires the editor and story title)");
            System.out.println("5. Show all stories for an editor");
            System.out.println("6. Calculate story score");
            System.out.println("7. Calculate story price");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.print("Write editor's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Write editor's DNI: ");
                    String dni = scanner.nextLine();

                    EditorService.addEditor(editors, new Editor(dni, name));

                    System.out.println("\n");
                }

                case 2 -> {
                    System.out.println("Write editor's DNI to delete: ");
                    String dni = scanner.nextLine();

                    EditorService.removeEditor(editors, dni);

                    System.out.println("\n");
                }

                case 3 -> {
                    System.out.print("Write title of news: ");
                    String title = scanner.nextLine();

                    System.out.print("Write content of this news: ");
                    String text = scanner.nextLine();

                    System.out.print("Write DNI of editor who wrote it: ");
                    String dni = scanner.nextLine();

                    System.out.print("\n");
                    System.out.println("1. Football");
                    System.out.println("2. Basketball");
                    System.out.println("3. Tennis");
                    System.out.println("4. F1");
                    System.out.println("5. Motorcycling");
                    System.out.print("Choose type of news: ");

                    int optionTypeNews = scanner.nextInt();
                    scanner.nextLine();

                    switch (optionTypeNews) {
                        case 1 -> {
                            System.out.print("Competition: ");
                            String competition = scanner.nextLine();
                            System.out.print("Club: ");
                            String club = scanner.nextLine();
                            System.out.print("Player: ");
                            String player = scanner.nextLine();
                            EditorService.addFootballNewsToEditor(editors, dni, title,
                                    text, competition,
                                    club, player);
                        }

                        case 2 -> {
                            System.out.print("Competition: ");
                            String competition = scanner.nextLine();
                            System.out.print("Club: ");
                            String club = scanner.nextLine();
                            EditorService.addBasketballToEditor(editors, dni, title,
                                    text, competition,
                                    club);
                        }

                        case 3 -> {
                            System.out.print("Competition: ");
                            String tennisCompetition = scanner.nextLine();
                            System.out.print("Player: ");
                            String player = scanner.nextLine();
                            EditorService.addTennisToEditor(editors, dni, title, text, player, tennisCompetition);
                        }

                        case 4 -> {
                            System.out.print("Team: ");
                            String team = scanner.nextLine();
                            EditorService.addF1ToEditor(editors, dni, title, text, team);
                        }

                        case 5 -> {
                            System.out.print("Team: ");
                            String team = scanner.nextLine();
                            EditorService.addMotorcyclingToEditor(editors, dni, title, text, team);
                        }
                    }

                    System.out.println("\n");
                }

                case 4 -> {
                    System.out.print("Write DNI of editor: ");
                    String dni = scanner.nextLine();

                    System.out.print("Write title of news: ");
                    String title = scanner.nextLine();

                    EditorService.removeStory(editors, dni, title);

                    System.out.println("\n");
                }

                case 5 -> {
                    System.out.print("Write ID of editor: ");
                    String dni = scanner.nextLine();

                    List<News> newsOfEditor = EditorService.getAllStoriesFromEditor(editors, dni);

                    for (News n : newsOfEditor) {
                        System.out.println("\n");
                        System.out.println("Title: " + n.getTitle());
                        System.out.println("Text: " + n.getText());
                        System.out.println("Price: " + n.getPrice());
                        System.out.println("Score: " + n.getScore());
                    }

                    System.out.println("\n");
                }

                case 6 -> {
                    System.out.print("Write ID of editor: ");
                    String dni = scanner.nextLine();

                    System.out.print("Write title of news to calculate score: ");
                    String title = scanner.nextLine();

                    Optional<Integer> score = NewsService.calculateNewsScore(editors, dni, title);
                    score.ifPresentOrElse(
                            s -> System.out.println("Score: " + s),
                            () -> System.out.println("Editor or news not found.")
                    );

                    System.out.println("\n");
                }

                case 7 -> {
                    System.out.print("Write ID of editor: ");
                    String dni = scanner.nextLine();

                    System.out.print("Write title of news to calculate score: ");
                    String title = scanner.nextLine();

                    Optional<Integer> score = NewsService.calculateNewsPrice(editors, dni, title);
                    score.ifPresentOrElse(
                            s -> System.out.println("Price: " + s),
                            () -> System.out.println("Editor or news not found.")
                    );

                    System.out.println("\n");
                }

                case 0 -> System.out.println("Bye!");

                default -> {
                    System.out.println("Wrong option.");
                    System.out.println("\n");
                }
            }

        }

        scanner.close();
    }
}
