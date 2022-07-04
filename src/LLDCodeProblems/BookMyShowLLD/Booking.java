package LLDCodeProblems.BookMyShowLLD;

import LLDCodeProblems.BookMyShowLLD.domains.Payment;
import LLDCodeProblems.BookMyShowLLD.domains.ShowSeat;
import LLDCodeProblems.BookMyShowLLD.domains.Show;
import LLDCodeProblems.BookMyShowLLD.enums.BookingStatus;

import java.util.Date;
import java.util.List;

public class Booking {
    private String bookingNumber;
    private int numberOfSeats;
    private Date createdOn;
    private BookingStatus status;

    private Show show;
    private List<ShowSeat> seats;
    private Payment payment;

    public boolean makePayment(Payment payment) {
        return true; //Make payment
    }

    public boolean cancel() {
        return true;
    }

    public boolean assignSeats(List<ShowSeat> seats) {
        return true;
    }
}
