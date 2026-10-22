import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingManager {
    private List<Booking> bookings = new ArrayList<>();

    public void createBooking(Scanner scanner) {
        Menu.showActivityMenu();

        if (!scanner.hasNextInt()) {
            System.out.println("Du måste skriva en siffra.");
            scanner.next();
            return;
        }

        int activity = scanner.nextInt();

        if (activity < 1 || activity > 3) {
            System.out.println("Ogiltig aktivitet. Välj 1, 2 eller 3.");
            return;
        }

        System.out.print("Hur många deltagare? ");

        if (!scanner.hasNextInt()) {
            System.out.println("Du måste skriva en siffra.");
            scanner.next();
            return;
        }

        int participants = scanner.nextInt();

        if (participants < 1) {
            System.out.println("Antalet deltagare måste vara minst 1.");
            return;
        }

        int price = 0;
        String activityName = "";

        switch (activity) {
            case 1:
                activityName = "Programmeringsworkshop";
                price = 200;
                break;

            case 2:
                activityName = "Matlagningskurs";
                price = 300;
                break;

            case 3:
                activityName = "Träningspass";
                price = 150;
                break;
        }

        int finalPrice = participants * price;

        Booking booking = new Booking(activityName, participants, finalPrice);
        bookings.add(booking);

        System.out.println("Aktivitet: " + activityName);
        System.out.println("Antal deltagare: " + participants);
        System.out.println("Slutpris: " + finalPrice + " kr");
    }

    public void showBookings() {

        if (bookings.isEmpty()) {
            System.out.println("Inga bokningar gjorda hittills.");
            return;
        }

        for (Booking booking : bookings) {
            System.out.println(
                    "Bokning " + booking.getActivity() + ", "
                            + booking.getNumberOfParticipants() + " deltagare, "
                            + booking.getTotalPrice() + " kr"
            );
        }
    }

    public void showSummary() {

        if (bookings.isEmpty()) {
            System.out.println("Inga bokningar gjorda hittills.");
            return;
        }

        int activity1 = 0;
        int activity2 = 0;
        int activity3 = 0;
        int totalPrice = 0;

        for (Booking booking : bookings) {

            totalPrice += booking.getTotalPrice();

            if (booking.getActivity().equals("Programmeringsworkshop")) {
                activity1++;
            } else if (booking.getActivity().equals("Matlagningskurs")) {
                activity2++;
            } else if (booking.getActivity().equals("Träningspass")) {
                activity3++;
            }
        }

        System.out.println("Antal bokningar: " + bookings.size());
        System.out.println("Total summa för bokningar: " + totalPrice);
        System.out.println("Antal bokade Programmeringsworkshop: " + activity1);
        System.out.println("Antal bokade Matlagningskurs: " + activity2);
        System.out.println("Antal bokade Träningspass: " + activity3);
    }
}

