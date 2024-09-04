public class Book {
    private String name;
    private String author;
    private int release_year;
    private boolean lent;

    /**
     * Konstruktor pro vytvoření nové knihy
     * @param name Název knihy
     * @param author Jméno autora knihy
     * @param release_year Rok vydání knihy
     */
    public Book(String name, String author, int release_year) {
        this.name = name;
        this.author = author;
        this.release_year = release_year;
        this.lent = false;
    }

    /**
     * metoda pro označení knihy jako "půjčená," pokud ještě není půjčená.
     * Pokud již půjčená je, vypíše upozornění
     */
    public void borrowBook() {
        if (!lent) {
            lent = true;
            System.out.println("Kniha " + name + " byla půjčena");
        } else {
            System.out.println("Kniha " + name + " je již půjčená");
        }
    }

    /**
     * metoda pro označení knihy jako "vrácená," pokud je půjčená.
     * Pokud je půjčená, vypíše upozornění
     *
     */
    public void returnBook() {
        if (lent) {
            lent = false;
            System.out.println("Kniha " + name + " byla vrácen");
        } else {
            System.out.println("Kniha " + name + " není půjčená");
        }
    }

    /**
     * metoda pro vypsání informací o knize
     */
    public void infoBook() {
        System.out.println("Název: " + name + ", Autor: " + author + ", Rok vydání: " + release_year + ", Stav: " + (lent ? "Půjčená" : "Dostupná"));
    }

    /**
     * Metoda, která vrátí název knihy
     *
     * @return Název knihy
     */
    public String getName() {
        return name;
    }

}