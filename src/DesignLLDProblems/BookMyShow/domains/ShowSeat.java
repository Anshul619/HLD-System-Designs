package LLDCodeProblems.BookMyShowLLD.domains;

public class ShowSeat extends CinemaHallSeat{

    public int isAvailable = 0;
    public String seatNumber;
    public int price;

    public Show show;

    public ShowSeat(int isAvailable, String seatNumber, int price) {
        this.isAvailable = isAvailable;
        this.seatNumber = seatNumber;
        this.price = price;
    }
}
