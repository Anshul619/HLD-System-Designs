package MovieBookingLikeBookMyShow;

import MovieBookingLikeBookMyShow.domains.Seat;
import MovieBookingLikeBookMyShow.domains.Show;

import java.util.List;


public class BookSeat {

    ShowsData showDataObj = new ShowsData();
    String date;
    String movieName;

    public BookSeat(String date, String movieName) {
        this.date = date;
        this.movieName = movieName;
    }

    /*public List<Seat> getAvailableSeats(String date, Show show) {

        List<Show> shows = showDataObj.shows;

        for(int i=0; i < shows.size(); i++) {

            //if (shows.get(i).date == "")
        }
    }*/

    public boolean book() {

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

                        /*synchronised (seats.get(j)) {
                            if (seats.get(j).isAvailable == 1) {
                                // Payment would be done here
                                //sleep(1000);
                                seats.get(j).isAvailable = 0;
                                return true;
                            }
                        }*/
                    }
                 }

            }
        }

        return false;

    }

    public static void main(String[] args) {
        BookSeat obj = new BookSeat("20-1-20", "Movie1");

        System.out.println(obj.book());
    }
}
