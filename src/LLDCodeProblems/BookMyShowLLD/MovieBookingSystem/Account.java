package LLDCodeProblems.MovieBookingLikeBookMyShow.MovieBookingSystem;

public class Account {
}

public class Account {
    private String id;
    private String password;
    private AccountStatus status;

    public boolean resetPassword();
}

public abstract class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;

    private Account account;
}

public class Customer extends Person {
    public boolean makeBooking(Booking booking);
    public List<Booking> getBookings();
}

public class Admin extends Person {
    public boolean addMovie(Movie movie);
    public boolean addShow(Show show);
    public boolean blockUser(Customer customer);
}

public class FrontDeskOfficer extends Person {
    public boolean createBooking(Booking booking);
}

public class Guest {
    public bool registerAccount();
}

public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}