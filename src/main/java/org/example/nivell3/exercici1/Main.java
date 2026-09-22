package org.example.nivell3.exercici1;

import org.example.nivell3.exercici1.models.Editor;
import org.example.nivell3.exercici1.models.News;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        List<Editor> editors = new ArrayList<>();
        List<News> news = new ArrayList<>();

        menu(editors, news);
    }


    private static void menu(List<Editor> editors, List<News> news) {
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
            scanner.nextLine(); // Avoids problem with Scanner

            switch (option) {
                case 1 -> editors.add(fillEditorData(scanner));
                case 2 -> removeEditor(scanner, editors);
            }

        }

        scanner.close();
    }

    private static Editor fillEditorData(Scanner scanner) {
        String name;
        String id;

        System.out.print("Write name: ");
        name = scanner.nextLine();

        System.out.print("Write ID: ");
        id = scanner.nextLine();

        return new Editor(id, name);
    }

    private static void removeEditor(Scanner scanner, List<Editor> editors) {
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
}
