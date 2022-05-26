package ParkingLot.Models.ParkingSpots;

import ParkingLot.Abstract.ParkingSpot;
import ParkingLot.Enums.ParkingSpotType;

public class LargeSpot extends ParkingSpot {
    public LargeSpot() {
        super(ParkingSpotType.LARGE);
    }
}