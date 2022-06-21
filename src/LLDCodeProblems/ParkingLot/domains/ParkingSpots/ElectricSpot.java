package LLDCodeProblems.ParkingLot.domains.ParkingSpots;

import LLDCodeProblems.ParkingLot.domains.Abstract.ParkingSpot;
import LLDCodeProblems.ParkingLot.enums.ParkingSpotType;

public class ElectricSpot extends ParkingSpot {
    public ElectricSpot() {
        super(ParkingSpotType.ELECTRIC);
    }
}