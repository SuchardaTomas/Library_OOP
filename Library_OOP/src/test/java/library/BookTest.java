package library;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book kniha;

    @BeforeEach
    void setUp() {
        kniha = new Book("1984", "George Orwell", Year.of(1984));
    }

    @Test
    void shouldAllowBorrowingBookWhenAvailable() {
        assertTrue(kniha.borrowBook());
    }

    @Test
    void shouldNotAllowBorrowingBookIfAlreadyLent() {
        kniha.borrowBook();
        assertFalse(kniha.borrowBook());
    }

    @Test
    void shouldAllowReturningBookWhenBorrowed() {
        kniha.borrowBook();
        assertTrue(kniha.returnBook());
    }

    @Test
    void shouldNotAllowReturningBookIfNotBorrowed() {
        assertFalse(kniha.returnBook());
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test dokončen\n");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Všechny testy dokončeny.");
    }
}