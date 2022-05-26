package ParkingLot.Models.Accounts;

import ParkingLot.Abstract.Account;

public class ParkingAttendant extends Account {
    public boolean processTicket(String TicketNumber) {
        return true;
    }
}