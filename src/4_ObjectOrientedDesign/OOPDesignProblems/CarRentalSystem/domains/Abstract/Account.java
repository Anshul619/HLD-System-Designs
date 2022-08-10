package LLDCodeProblems.CarRentalSystem.domains.Abstract;

import LLDCodeProblems.CarRentalSystem.domains.Person;
import LLDCodeProblems.CarRentalSystem.enums.AccountStatus;

public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;

    public boolean resetPassword() {
        return false;
    }
}
