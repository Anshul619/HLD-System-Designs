package LLDCodeProblems.HotelBookingSystemLLD;

import LLDCodeProblems.HotelBookingSystemLLD.domains.Room;
import LLDCodeProblems.HotelBookingSystemLLD.enums.PaymentStatus;

import java.time.Duration;
import java.util.Date;
import java.util.List;

class Booking {
    int bookingId;
    int userId;
    int hotelId;

    // We are assuming that in a single
    // booking we can book only the rooms
    // of a single hotel
    List<Room> bookedRooms;

    int amount;
    PaymentStatus status_of_payment;
    Date bookingTime;
    Duration duration;

    public boolean makeBooking() {
        return true;
    }
}