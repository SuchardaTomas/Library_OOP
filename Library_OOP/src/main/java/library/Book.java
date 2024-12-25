package library;

import java.time.Year;

public class Book implements BookService {
    private String title;
    private String author;
    private Year releaseYear;
    private boolean lent;

    public Book(String title, String author, Year releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.lent = false;
    }

    public Book(String title, String author, Year releaseYear, boolean lent) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.lent = lent;
    }

    public String getTitle() {
        return title;
    }

    public boolean isLent() {
        return lent;
    }

    public String getAuthor() {
        return author;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Kniha{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseYear=" + releaseYear +
                ", lent=" + (lent ? "Půjčená" : "Dostupná") +
                '}';
    }

    @Override
    public boolean borrowBook() {
        if (!lent) {
            lent = true;
            System.out.printf("Kniha %s byla půjčena\n", title);
            return true;
        } else {
            System.out.printf("Kniha %s je již půjčena\n", title);
            return false;
        }
    }

    @Override
    public boolean returnBook() {
        if (lent) {
            lent = false;
            System.out.printf("Kniha %s byla vrácena\n", title);
            return true;
        } else {
            System.out.printf("Kniha %s není půjčena\n", title);
            return false;
        }
    }
}


