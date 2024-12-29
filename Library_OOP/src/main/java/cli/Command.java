package cli;

import java.time.Year;
import java.util.Scanner;

import library.Book;
import library.Library;

public class Command implements Runnable{
    private static final Scanner sc = new Scanner(System.in);
    private final Library library;
    private final String file = "C:\\Users\\tomas\\Desktop\\Library_OOP\\Library_OOP\\src\\main\\java\\data\\Knihy.csv";

    public Command() {
        library = new Library();
        library.readRecords(file);
    }

    @Override
    public void run() {
        System.out.println("Vítejte ve správě knihovny\n");
        boolean run = true;

        do {
            StringBuilder menu = getMenu();
            System.out.println(menu.toString());
            int line = sc.nextInt();

            try {
                switch (line) {
                    case 1 -> showBooks();
                    case 2 -> addNewBook();
                    case 3 -> returnBook();
                    case 4 -> borrowBook();
                    //TODO přidat hledání knihy
                    case 5 -> run = false;
                    default -> System.out.println("Chybný příkaz");
                }
            } catch (IllegalArgumentException ex) {
                System.out.println();
            }
        }while (run);
        System.out.println("Konec správy knihovny");
        sc.close();
    }

    private void showBooks() {
        if (library.getBooks().isEmpty()) {
            System.out.println("V knihovně nejsou žádné knihy\n");
        } else {
            library.showAllBooks();
        }
    }

    private void addNewBook() {
        sc.nextLine();
        System.out.println("Zadejte název knihy");
        String title = sc.nextLine();
        System.out.println("\nZadejte jméno autora");
        String author = sc.nextLine();
        System.out.println("\nZadejte rok vydání");
        Year year = Year.parse(sc.nextLine());

        Book newBook = new Book(title, author, year);

        library.addBook(newBook);
        library.addRecords(file);

        System.out.println("Kniha byla úspěšně přidána\n");
    }

    private void returnBook() {
        sc.nextLine();
        System.out.println("Zadejte jméno knihy kterou chcete vrátit");
        String title = sc.nextLine();
        library.returnBookByName(title);
    }

    private void borrowBook() {
        sc.nextLine();
        System.out.println("Zadejte jméno knihy, kterou si chcete pujcit");
        String title = sc.nextLine();
        library.borrowBookByName(title);
    }

    private void findBook() {
        sc.nextLine();
        System.out.println("Zadejte název/autora knihy");
        String query = sc.nextLine();

        library.findBookByTitleOrAuthor(query);
    }

    private StringBuilder getMenu() {
        return new StringBuilder()
                .append("Zadejte příkaz: \n")
                .append("1)Vypsání všech knih\n")
                .append("2)Přidání nové knihy\n")
                .append("3)Vrácení knihy\n")
                .append("4)Půjčení knihy\n")
                .append("5)Konec");
    }
}
