package LLDCodeProblems.ParkingLot.domains.Vehicles;

import LLDCodeProblems.ParkingLot.domains.Abstract.Vehicle;
import LLDCodeProblems.ParkingLot.enums.VehicleType;

public class Truck extends Vehicle {
    public Truck() {
        super(VehicleType.TRUCK);
    }
}