package MovieBookingLikeBookMyShow.domains;

import java.util.ArrayList;
import java.util.List;

public class Show {

    // Date class object
    public String date;

    public List<Seat> seatsList = new ArrayList<Seat>();

    public String movieName;

    public Show(String date, List<Seat> seats, String movie) {
        this.date = date;
        this.seatsList = seats;
        this.movieName = movie;
    }

}
