package org.example.nivell3.exercici1.models;

public class News {
    private String typeNews;
    private String title;
    private String content;
    private int score;
    private int price;
    private String idEditor;

    public News(String typeNews, String title, String idEditor, String content) {
        this.typeNews = typeNews;
        this.title = title;
        this.content = content;
        this.score = 0;
        this.price = 0;
        this.idEditor = idEditor;
    }

    public String getTitle() { return title; }
    public String getIdEditor() { return idEditor; }
    public String getType() { return typeNews; }
    public String getContent() {
        return content;
    }
    public int getScore() { return score; }
    public int getPrice() { return price; }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
