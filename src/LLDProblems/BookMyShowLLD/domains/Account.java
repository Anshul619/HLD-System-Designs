package LLDCodeProblems.BookMyShowLLD.domains;

import LLDCodeProblems.BookMyShowLLD.enums.AccountStatus;

public class Account {
    private String id;
    private String password;
    private AccountStatus status;

    public boolean resetPassword() {
        return false;
    }
}


