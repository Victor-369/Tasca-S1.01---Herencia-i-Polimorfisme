# Nivell 3 - Exercici 1: Herencia i Polimorfisme

A simple Java console app to manage editors and sports news: add/remove editors, add/remove news, list news by editor, and calculate price and score for each news item.

## File structure
```
nivell3/
└── exercici1/
    ├── Main.java              # Entry point
    ├── README.md
    ├── models/
    │   ├── Editor.java        # Editor data
    │   └── News.java          # News data
    ├── ui/
    │   └── Menu.java          # Console menu
    └── utils/
        ├── EditorManage.java  # Add/remove editors, add/remove/list news linked with editor
        └── NewsManage.java    # Search news and calculate price/score
```

## Menu options
```
1. Add editor
2. Remove editor
3. Add story to an editor
4. Remove story (requires the editor and story title)
5. Show all stories for an editor
6. Calculate story score
7. Calculate story price
0. Exit
```

Note: removing an editor (option 2) also removes all of their news.