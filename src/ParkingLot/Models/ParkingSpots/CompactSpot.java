package ParkingLot.Models.ParkingSpots;

import ParkingLot.Abstract.ParkingSpot;
import ParkingLot.Enums.ParkingSpotType;

public class CompactSpot extends ParkingSpot {
    public CompactSpot() {
        super(ParkingSpotType.COMPACT);
    }
}