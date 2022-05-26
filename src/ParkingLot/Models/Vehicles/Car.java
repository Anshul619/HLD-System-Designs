package ParkingLot.Models.Vehicles;

import ParkingLot.Abstract.Vehicle;
import ParkingLot.Enums.VehicleType;

public class Car extends Vehicle {
    public Car() {
        super(VehicleType.CAR);
    }
}