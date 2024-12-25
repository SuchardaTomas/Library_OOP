package library;

import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book kniha1 = new Book("1984", "George Orwell", Year.of(1984));
    Book kniha2 = new Book("1984", "George Orwell", Year.of(1984), true);

    @Test
    void borrowBook1() {
        assertEquals(true, kniha1.borrowBook());
    }

    @Test
    void borrowBook2() {
        assertEquals(false, kniha2.borrowBook());
    }

    @Test
    void returnBook1() {
        assertEquals(true, kniha2.returnBook());
    }

    @Test
    void returnBook2() {
        assertEquals(false, kniha1.returnBook());
    }
}