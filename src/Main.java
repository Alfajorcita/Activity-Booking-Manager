import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookingManager manager = new BookingManager();

        Menu.welcome();

        while (true) {

            Menu.showGeneralMenu();

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        manager.createBooking(scanner);
                        break;

                    case 2:
                        manager.showBookings();
                        break;

                    case 3:
                        manager.showSummary();
                        break;

                    case 4:
                        System.out.println("Avslutar programmet...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Ogiltigt val. Välj 1, 2, 3 eller 4.");
                }

            } else {
                System.out.println("Fel! Du måste skriva ett nummer.");
                scanner.next();
            }
        }
    }
}