package org.example.nivell3.exercici1.ui;

import org.example.nivell3.exercici1.models.Editor;
import org.example.nivell3.exercici1.models.News;
import org.example.nivell3.exercici1.utils.EditorManage;
import org.example.nivell3.exercici1.utils.NewsManage;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void showMenu(List<Editor> editors, List<News> news) {
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
            scanner.nextLine();                 // Avoids Scanner's problem about nextInt()

            switch (option) {
                case 1 -> editors.add(EditorManage.fillEditorData(scanner));
                case 2 -> EditorManage.removeEditor(scanner, editors);
                case 3 -> EditorManage.addStoryToEditor(scanner, news);
                case 4 -> EditorManage.removeStory(scanner, news);
                case 5 -> EditorManage.showAllStoriesFromEditor(scanner, news);
                case 6 -> NewsManage.getNewsToCalculateScore(scanner, news);
                case 7 -> NewsManage.getNewsToCalculatePrice(scanner, news);
                default -> System.out.println("Wrong option.");
            }

        }

        scanner.close();
    }
}
