import java.util.Scanner;

public class Manager {
    static Scanner sc = new Scanner(System.in);
    static Library library = new Library();

    public static void addBook() {
        System.out.println("Zadejte název knihy");
        String name = sc.nextLine();

        System.out.println("Zadejte jméno autora");
        String author = sc.nextLine();

        System.out.println("Zadejte rok vydání");
        int release_year = sc.nextInt();

        Book book = new Book(name, author, release_year);
        library.addBook(book);

        sc.nextLine();

    }

    public static void borrowBook() {
        System.out.println("Zadejte název knihy, kterou chete půjčit:");
        String name = sc.nextLine();
        library.borrowBook(name);
        sc.nextLine();
    }

    public static void returnBook() {
        System.out.println("Zadejte název knihy, kterou vracíte:");
        String name = sc.nextLine();
        library.returnBook(name);
        sc.nextLine();
    }

    public static void showBooks() {
        library.showBooks();
        sc.nextLine();
    }

    public static void quit() {
        System.exit(0);
    }
}