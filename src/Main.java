import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Správa knihovny: \n1. Přidat knihu \n2. Půjčit knihu \n3. Vrátit knihu \n4. Zobrazit knihy \n5. Konec");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> Manager.addBook();
                case 2 -> Manager.borrowBook();
                case 3 -> Manager.returnBook();
                case 4 -> Manager.showBooks();
                case 5 -> Manager.quit();
                default -> System.out.println("Neplatná volba");
            }
        }
    }
}
