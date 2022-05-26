package ParkingLot.Models.ParkingSpots;

import ParkingLot.Abstract.ParkingSpot;
import ParkingLot.Enums.ParkingSpotType;

public class ElectricSpot extends ParkingSpot {
    public ElectricSpot() {
        super(ParkingSpotType.ELECTRIC);
    }
}