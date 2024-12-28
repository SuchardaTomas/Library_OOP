package library;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Year;
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

    @Override
    public void readRecords(String file) {
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = reader.readLine()) != null){
                String[] lineValues = line.split(";");
                String title = lineValues[0];
                String author = lineValues[1];
                Year release_year = Year.of(Integer.parseInt(lineValues[2]));
                Boolean lent = Boolean.valueOf(lineValues[3]);

                books.add(new Book(title, author, release_year));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addRecords(String file) {
        try(PrintWriter writer = new PrintWriter(file)){
            books.forEach(b -> writer.printf("%s;%s;%d;%b%n", b.getTitle(), b.getAuthor(), b.getReleaseYear().getValue(), b.isLent()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
