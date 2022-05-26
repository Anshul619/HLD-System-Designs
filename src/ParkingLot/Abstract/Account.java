package ParkingLot.Abstract;

import ParkingLot.Enums.AccountStatus;
import ParkingLot.Models.Person;

public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;

    public boolean resetPassword();
}