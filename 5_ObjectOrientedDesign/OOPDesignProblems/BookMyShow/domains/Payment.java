package LLDCodeProblems.BookMyShowLLD.domains;

import LLDCodeProblems.BookMyShowLLD.enums.PaymentStatus;

import java.util.Date;

public class Payment {
    private double amount;
    private Date createdOn;
    private int transactionId;
    private PaymentStatus status;
}
