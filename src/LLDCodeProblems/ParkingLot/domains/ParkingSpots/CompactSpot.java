package LLDCodeProblems.ParkingLot.domains.ParkingSpots;

import LLDCodeProblems.ParkingLot.domains.Abstract.ParkingSpot;
import LLDCodeProblems.ParkingLot.enums.ParkingSpotType;

public class CompactSpot extends ParkingSpot {
    public CompactSpot() {
        super(ParkingSpotType.COMPACT);
    }
}