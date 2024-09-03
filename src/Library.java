import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Kniha " + book.getName() + " byla přidána do knihovny");
    }

    public void lentBook(String name) {
        for (Book book : books) {
            if(book.getName().equalsIgnoreCase(name)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Kniha " + name + " nebyla nalezena");
    }

    public void returnBook(String name) {
        for (Book book : books) {
            if(book.getName().equalsIgnoreCase(name)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Kniha " + name + " nebyla nalezena");
    }

    public void showBooks() {
        for (Book book : books) {
            book.infoBook();
        }
    }
}