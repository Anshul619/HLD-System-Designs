package CodeProblems.MovieBookingLikeBookMyShow.domains;

public class Seat {

    public int isAvailable = 0;
    public String seatNumber;
    public int price;

    public Seat(int isAvailable, String seatNumber, int price) {
        this.isAvailable = isAvailable;
        this.seatNumber = seatNumber;
        this.price = price;
    }
}
