package library;

import java.util.LinkedList;
import java.util.List;

public class Library implements LibraryService{
    private List<Book> books;

    public Library() {
        this.books = new LinkedList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void borrowBookByName(String title) {
        books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .ifPresentOrElse(b -> b.borrowBook(),
                        () -> System.out.printf("Kniha %s nebyla nalezena\n", title));
    }

    @Override
    public void returnBookByName(String title) {
        books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .ifPresentOrElse(b -> b.returnBook(),
                        () -> System.out.printf("Kniha %s nebyla nalezena\n", title));
    }

    @Override
    public void showAllBooks() {
        books.forEach(b -> System.out.println(b));
    }
}
