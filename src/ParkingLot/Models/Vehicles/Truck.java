package ParkingLot.Models.Vehicles;

import ParkingLot.Abstract.Vehicle;
import ParkingLot.Enums.VehicleType;

public class Truck extends Vehicle {
    public Truck() {
        super(VehicleType.TRUCK);
    }
}