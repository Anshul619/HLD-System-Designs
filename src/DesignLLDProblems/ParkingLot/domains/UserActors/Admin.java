package LLDCodeProblems.ParkingLot.domains.UserActors;

import LLDCodeProblems.ParkingLot.domains.Abstract.Account;
import LLDCodeProblems.ParkingLot.domains.Abstract.ParkingSpot;
import LLDCodeProblems.ParkingLot.services.ParkingDisplayBoard;
import LLDCodeProblems.ParkingLot.services.ParkingFloor;

public class Admin extends Account {
    public boolean addParkingFloor(ParkingFloor floor) {
        return true;
    }

    public boolean addParkingSpot(String floorName, ParkingSpot spot) {
        return true;
    }

    public boolean addParkingDisplayBoard(String floorName, ParkingDisplayBoard displayBoard) {
        return true;
    }

    public boolean addCustomerInfoPanel(String floorName, CustomerInfoPanel infoPanel) {
        return true;
    }

    public boolean addEntrancePanel(EntrancePanel entrancePanel) {
        return true;
    }

    public boolean addExitPanel(ExitPanel exitPanel) {
        return true;
    }
}