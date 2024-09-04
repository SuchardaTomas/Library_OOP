import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    /**
     * Konstruktor pro vytvoření nové knihovny.
     * inicializuje prázdný seznam knih
     */
    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Metoda pro přidání knihy do knihovny
     * @param book Kniha, která má být přidána
     */
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Kniha " + book.getName() + " byla přidána do knihovny");
    }

    /**
     * Metoda pro půjčení knihy podle zadaného názvu knihy
     * @param name Název knihy pro půjčení
     */
    public void borrowBook(String name) {
        for (Book book : books) {
            if(book.getName().equalsIgnoreCase(name)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Kniha " + name + " nebyla nalezena");
    }

    /**
     * Metoda pro vrácení půjčené knihy podle zadaného názvu
     * @param name Název knihy pro vrácení
     */
    public void returnBook(String name) {
        for (Book book : books) {
            if(book.getName().equalsIgnoreCase(name)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Kniha " + name + " nebyla nalezena");
    }

    /**
     * Metoda pro zobrazení všech knih v knihovně
     */
    public void showBooks() {
        for (Book book : books) {
            book.infoBook();
        }
    }
}