package library;

public interface LibraryService {
    public void addBook(Book book);
    public void borrowBookByName(String title);
    public void returnBookByName(String title);
    public void showAllBooks();
}
