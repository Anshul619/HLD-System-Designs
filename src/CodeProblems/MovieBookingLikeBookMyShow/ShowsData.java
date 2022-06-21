package CodeProblems.MovieBookingLikeBookMyShow;

import CodeProblems.MovieBookingLikeBookMyShow.domains.Seat;
import CodeProblems.MovieBookingLikeBookMyShow.domains.Show;

import java.util.ArrayList;
import java.util.List;

public class ShowsData {

    public List<Show> shows = new ArrayList<>();

    public ShowsData(){

        Seat firstSeat = new Seat(1, "S1", 100);
        Seat seatSeat = new Seat(1, "S2", 200);

        List<Seat> firstShowSeat = new ArrayList<>();
        firstShowSeat.add(firstSeat);
        firstShowSeat.add(seatSeat);

        Show show1 = new Show("20-1-20", firstShowSeat, "Movie1");
        shows.add(show1);

        firstSeat = new Seat(1, "S1", 100);
        seatSeat = new Seat(1, "S2", 200);

        List<Seat> secondShowSeat = new ArrayList<>();
        secondShowSeat.add(firstSeat);
        secondShowSeat.add(seatSeat);

        Show show2 = new Show("20-1-25", secondShowSeat, "Movie2");
        shows.add(show2);

    }


 }
