public class Booking {
    private String activity;
    private int numberOfParticipants;
    private int totalPrice;

    public Booking(String activity, int numberOfParticipants, int totalPrice){
        this.activity = activity;
        this.numberOfParticipants = numberOfParticipants;
        this.totalPrice = totalPrice;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public String getActivity() {
        return activity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}