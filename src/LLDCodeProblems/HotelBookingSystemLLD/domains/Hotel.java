package LLDCodeProblems.HotelBookingSystemLLD.domains;

import java.util.List;

public class Hotel {
    int hotelId;
    String hotelName;
    Address address;

    // hotel contains the list of rooms
    List<Room> rooms;
    float rating;
    Facilities facilities;
}


