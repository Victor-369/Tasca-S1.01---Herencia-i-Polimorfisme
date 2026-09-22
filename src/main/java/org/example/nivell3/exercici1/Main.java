package org.example.nivell3.exercici1;

import org.example.nivell3.exercici1.models.Editor;
import org.example.nivell3.exercici1.models.News;
import org.example.nivell3.exercici1.ui.Menu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Editor> editors = new ArrayList<>();
        List<News> news = new ArrayList<>();

        Menu menu = new Menu();
        menu.showMenu(editors, news);
    }
}
