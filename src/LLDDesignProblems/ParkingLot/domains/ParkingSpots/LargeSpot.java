package LLDCodeProblems.ParkingLot.domains.ParkingSpots;

import LLDCodeProblems.ParkingLot.domains.Abstract.ParkingSpot;
import LLDCodeProblems.ParkingLot.enums.ParkingSpotType;

public class LargeSpot extends ParkingSpot {
    public LargeSpot() {
        super(ParkingSpotType.LARGE);
    }
}