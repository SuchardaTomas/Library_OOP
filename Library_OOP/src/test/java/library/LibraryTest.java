package library;

import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library knihovna = new Library();
    Book kniha1 = new Book("1984", "George Orwell", Year.of(1984), false);
    Book kniha2 = new Book("1984", "George Orwell", Year.of(1984), true);

    @Test
    void addBook() {
        knihovna.addBook(kniha1);
        assertEquals(1, knihovna.getBooks().size());
    }

    @Test
    void borrowBookByName1() {
        knihovna.addBook(kniha1);
        knihovna.borrowBookByName("1984");
        assertEquals(true, kniha1.isLent());
    }

    @Test
    void borrowBookByName2() {
        knihovna.addBook(kniha1);
        knihovna.borrowBookByName("Hobbit");
        assertEquals(false, kniha1.isLent());
    }

    @Test
    void returnBookByName1() {
        knihovna.addBook(kniha2);
        knihovna.returnBookByName("1984");
        assertEquals(false, kniha2.isLent());
    }

    @Test
    void returnBookByName2() {
        knihovna.addBook(kniha1);
        knihovna.returnBookByName("1984");
        assertEquals(false, kniha1.isLent());
    }

    @Test
    void returnBookByName3() {
        knihovna.addBook(kniha1);
        knihovna.returnBookByName("Hobbit");
        assertEquals(false, kniha1.isLent());
    }
}