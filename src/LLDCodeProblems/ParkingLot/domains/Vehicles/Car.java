package LLDCodeProblems.ParkingLot.domains.Vehicles;

import LLDCodeProblems.ParkingLot.domains.Abstract.Vehicle;
import LLDCodeProblems.ParkingLot.enums.VehicleType;

public class Car extends Vehicle {
    public Car() {
        super(VehicleType.CAR);
    }
}