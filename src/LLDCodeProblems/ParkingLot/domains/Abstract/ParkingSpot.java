package LLDCodeProblems.ParkingLot.domains.Abstract;

import LLDCodeProblems.ParkingLot.enums.ParkingSpotType;
import LLDCodeProblems.ParkingLot.Vehicle;

public abstract class ParkingSpot {
    private String number;
    private boolean free;
    private Vehicle vehicle;
    private final ParkingSpotType type;

    public boolean IsFree() {
        return false;
    }

    public ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }

    public boolean assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        free = false;
        return true;
    }

    public String getNumber() {
        return number;
    }

    public boolean removeVehicle() {
        this.vehicle = null;
        free = true;
        return true;
    }

    public ParkingSpotType getType() {
        return type;
    }
}
