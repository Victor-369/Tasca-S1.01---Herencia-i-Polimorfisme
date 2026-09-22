package org.example.nivell3.exercici1.models;

public class News {
    private String typeNews;
    private String title;
    private String content;
    private float score;
    private float price;
    private String idEditor;

    public News(String typeNews, String title, String idEditor) {
        this.typeNews = typeNews;
        this.title = title;
        this.content = null;
        this.score = 0;             // Pending to fill, like a null
        this.price = 0;             // Pending to fill, like a null
        this.idEditor = idEditor;
    }

    public String getTitle() {
        return title;
    }

    public String getIdEditor() {
        return idEditor;
    }

    public String getType() {
        return typeNews;
    }

    public String getContent() {
        return content;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
