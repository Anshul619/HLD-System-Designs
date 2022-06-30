package LLDCodeProblems.BookMyShowLLD;

import LLDCodeProblems.BookMyShowLLD.domains.Show;
import LLDCodeProblems.BookMyShowLLD.domains.ShowSeat;
import LLDCodeProblems.BookMyShowLLD.enums.BookingStatus;

import java.util.List;

public class Booking {
    private String bookingNumber;
    private int numberOfSeats;
    private Date createdOn;
    private BookingStatus status;

    private Show show;
    private List<ShowSeat> seats;
    private Payment payment;

    public boolean makePayment(Payment payment);
    public boolean cancel();
    public boolean assignSeats(List<ShowSeat> seats);

    /*public boolean book() {

        List<Show> shows = showDataObj.shows;

        for(int i=0; i < shows.size(); i++) {

            if (shows.get(i).date.equals(date) && shows.get(i).movieName.equals(movieName)){

                List<Seat> seats = shows.get(i).seatsList;

                for(int j =0; j < seats.size(); j++) {

                    if (seats.get(j).isAvailable == 1) {

                        // Payment would be done here
                        //sleep(1000);
                        seats.get(j).isAvailable = 0;
                        return true;


                        //HashMap
                        //Semaphore seat = new Semaphore(1);

                        synchronised (seats.get(j)) {
                            if (seats.get(j).isAvailable == 1) {
                                // Payment would be done here
                                //sleep(1000);
                                seats.get(j).isAvailable = 0;
                                return true;
                            }
                        }
                    }
                }

            }
        }

        return false;

    }

    public static void main(String[] args) {
        BookSeat obj = new BookSeat("20-1-20", "Movie1");

        System.out.println(obj.book());
    }*/
}
