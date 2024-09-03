public class Book {
    private String name;
    private String author;
    private int release_year;
    private boolean lent;

    public Book(String name, String author, int release_year) {
        this.name = name;
        this.author = author;
        this.release_year = release_year;
        this.lent = false;
    }

    public void borrowBook() {
        if (!lent) {
            lent = true;
            System.out.println("Kniha " + name + " byla půjčena");
        } else {
            System.out.println("Kniha " + name + " je již půjčená");
        }
    }

    public void returnBook() {
        if (lent) {
            lent = false;
            System.out.println("Kniha " + name + " byla vrácen");
        } else {
            System.out.println("Kniha " + name + " není půjčená");
        }
    }

    public void infoBook() {
        System.out.println("Název: " + name + ", Autor: " + author + ", Rok vydání: " + release_year + ", Stav " + (lent ? "Půjčená" : "Dostupná"));
    }

    public String getName() {
        return name;
    }

}