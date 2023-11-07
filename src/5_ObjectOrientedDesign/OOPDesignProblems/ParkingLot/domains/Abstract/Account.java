package LLDCodeProblems.ParkingLot.domains.Abstract;

import LLDCodeProblems.ParkingLot.enums.AccountStatus;
import LLDCodeProblems.ParkingLot.domains.Person;

public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;

    public boolean resetPassword();
}