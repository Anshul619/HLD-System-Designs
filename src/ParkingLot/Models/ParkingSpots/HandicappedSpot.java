package ParkingLot.Models.ParkingSpots;

import ParkingLot.Abstract.ParkingSpot;
import ParkingLot.Enums.ParkingSpotType;

public class HandicappedSpot extends ParkingSpot {
    public HandicappedSpot() {
        super(ParkingSpotType.HANDICAPPED);
    }
}