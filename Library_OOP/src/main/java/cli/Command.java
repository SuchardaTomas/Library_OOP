package cli;

import library.Book;
import library.Library;

import java.time.Year;
import java.util.Scanner;

public class Command implements Runnable{
    private static final Scanner sc = new Scanner(System.in);
    private final Library library;

    public Command() {
        library = new Library();
    }

    @Override
    public void run() {
        System.out.println("Vítejte ve správně knihovny\n");
        boolean run = true;

        do {
            System.out.println("Zadejte příkaz: \n1)Vypsání všech knih \n2)přidání knihy \n3)vrácení knihy \n4)půjčení knihy \n5)konec");
            int line = sc.nextInt();

            try {
                switch (line) {
                    case 1 -> nactiKnihy();
                    case 2 -> pridejNovouKnihu();
                    case 3 -> vraceniKnihy();
                    case 4 -> pujceniKnihy();
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

    public void nactiKnihy() {

        if (library.getBooks().size() == 0) {
            System.out.println("V knihovně nejsou žádné knihy\n");
        } else {
            library.showAllBooks();
            System.out.println();
        }
    }

    public void pridejNovouKnihu() {
        sc.nextLine();
        System.out.println("Zadejte název knihy");
        String title = sc.nextLine();
        System.out.println("Zadejte jméno autora");
        String author = sc.nextLine();
        System.out.println("Zadejte rok vydání");
        Year year = Year.parse(sc.nextLine());

        Book newBook = new Book(title, author, year);

        library.addBook(newBook);

        System.out.println("Kniha byla úspěšně přidána\n");
    }

    public void vraceniKnihy() {
        sc.nextLine();
        System.out.println("Zadejte jméno knihy kterou chcete vrátit");
        String title = sc.nextLine();
        library.returnBookByName(title);
    }

    public void pujceniKnihy() {
        sc.nextLine();
        System.out.println("Zadejte jméno knihy, kterou si chcete pujcit");
        String title = sc.nextLine();
        library.borrowBookByName(title);
    }
}
