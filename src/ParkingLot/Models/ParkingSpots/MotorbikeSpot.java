package ParkingLot.Models.ParkingSpots;

import ParkingLot.Abstract.ParkingSpot;
import ParkingLot.Enums.ParkingSpotType;

public class MotorbikeSpot extends ParkingSpot {
    public MotorbikeSpot() {
        super(ParkingSpotType.MOTORBIKE);
    }
}