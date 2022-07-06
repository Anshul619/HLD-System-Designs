package LLDCodeProblems.ParkingLot.domains.ParkingSpots;

import LLDCodeProblems.ParkingLot.domains.Abstract.ParkingSpot;
import LLDCodeProblems.ParkingLot.enums.ParkingSpotType;

public class MotorbikeSpot extends ParkingSpot {
    public MotorbikeSpot() {
        super(ParkingSpotType.MOTORBIKE);
    }
}