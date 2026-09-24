# Nivell 3 - Exercici 1: Herencia i Polimorfisme

A simple Java console app to manage editors and sports news: add/remove editors, add/remove news, list news by editor, and calculate price and score for each news item.

## File structure
```
nivell3/
└── exercici1/
    ├── Main.java                   # Entry point
    ├── README.md
    ├── models/
    │   ├── Editor.java             # Editor data
    │   ├── FootballNews.java       # Football data
    │   ├── BasketballNews.java     # Basketball data
    │   ├── TennisNews.java         # Tennis data
    │   ├── F1News.java             # F1 data
    │   └── MotorcyclingNews.java   # Motorcycling data
    ├── ui/
    │   └── Menu.java               # Console menu
    └── services/
        ├── EditorService.java      # Add/remove editors, add/remove/list news linked with editor
        └── NewsService.java        # Search news and calculate price/score
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

### Why is `scanner.nextLine()` needed after `nextInt()` in Menu.java?

When using Java's `Scanner`, `nextInt()` reads only the integer entered by the user, but it **does not consume the newline character (`\n`)** generated when the user presses Enter.

For example:

```java
int option = scanner.nextInt();
scanner.nextLine();
```

After nextInt(), the integer is consumed, but the newline remains in the Scanner input buffer.

If we call nextLine() immediately afterwards, it consumes that remaining newline. This prevents the next nextLine() call from returning an empty string unexpectedly.

In other words:

```Java
User enters:  1 + Enter

nextInt()   → reads "1"
nextLine()  → consumes the remaining "\n"
```

This is a common issue when mixing nextInt() (or other nextXxx() methods) with nextLine() in Java's Scanner.