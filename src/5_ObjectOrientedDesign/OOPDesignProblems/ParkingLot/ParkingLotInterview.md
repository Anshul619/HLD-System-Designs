/**
    Asked in Alation interview round, 7thJuly2022
/*

* Design a system responsible for indicating to a valet, which spots to park cars in, issue tickets,
  and accept tickets to inform a valet which parking spot a car is located in.

* Details

The valet parking system should be able to accept multiple types of cars, and indicate a spot
to park them in. Spots are identified by numbers. Each parking spot can cater to certain types
of vehicles.

There are 2 types of cars
* Sedan
* SUV
  Both types of cars can also be EV (electric vehicles).
  There are 3 types of parking spots
* Regular
* EV
* SUV
  Each parking spot can accommodate certain types of vehicles:
* SUVs can only be parked in “SUV”, or “EV” (if electric) parking spots.
* Electric cars should be parked in EV vehicle parking spots, but if none are available,
  they can be parked in regular spots.
* EV parking spots are big enough to accommodate SUVs and regular cars.
* Regular cars can fit in any spot
  At the beginning of a night, the valet system will be initialized with data on the parking spots.
  Every spot is numbered, and given a type (“SUV”, “EV” or “regular”). The valet system will be
  initialized with an array of parking spots. Each spot has a spot number and type.
  */

/*
Different types of Cars
- SUV -> SUV
- Electric cars - SUV - EV
- Sedan - Regular
  */

import java.io.*;
import java.util.*;

class Main {
public static void main(String[] args) {
System.out.println("Hello, Py!");
System.out.println("You're running Java!");
}
}

Classes
- Person abstract
- TicketCollector extends Person
- Vehical abstract - number, owner_name, its construct type
- SUV extends Vehical
- Electric Cards extends Vehical
- Sedan extends Vehical
- Spot abstract
- Regular extends Spot
- EV extends Spot
- SUV extends Spot
- ParkingFloor class - List of Spot
- ParkingLot class - List of ParkingFloor
- spots counts
- assignVehical(Vehical vehical) {
    - check Vehical type
    - if its available ( is not full)
    - generate the ticket
    - increment spot counts ( increment)
    - issue the ticket
      }
- Ticket class - price

public class ParkingLot {

private List<ParkingFloor> floors;

int SUVSpotCount = 0;
int RegularSpotCount = 0;

private void incrementCount(Spot spot) {
SUVSpotCount++;
}

private void decrementCount(Spot spot) {
SUVSpotCount--;
}

private Spot getFreeSpot(Vehical vehical)
{
//check SUVSpotCount;
//return new Spot();
}  
public Ticket parkVehical(Vehical vehical) {

    Spot spot = getFreeSpot(vehical);
    
    Ticket ticket = new Ticket(Vehical vehical, Spot spot);
    incrementCount();
    
    return ticket;

}

public Vehical getVehical(Ticket ticket) {
return ticket.getVehical();
}

}

public enum VehicalTypes {
SUV,
ElectricCar,
Sedan
}

public abstract Vehical {
private String vehicalNumber;
private VehicalTypes type;

Vehical(VehicalTypes type) {
this.type = type;
}

public void setVehicalNumber(String vehicalNumber) {
this.vehicalNumber = vehicalNumber;
}

}

public class SUV extends Vehical{

SUV(){
super(VehicalTypes.SUV);
}
}

// Similar for ElectricCar, Sedan classes


public enum SpotTypes {
SUV,
Regular,
EV
}

public abstract Spot {

private Vehical assignedVehical;
private SpotTypes type;

Spot(SpotTypes type) {
this.type = type;
}

public boolean assignVehical(Vehical vehical) {
assignedVehical = vehical;
return true;
}

public boolean unassign() {
assignedVehical = null;
}

public boolean isFree() {
if (assignedVehical == null) {
return true;
}
return false;
}

}
// Similar for SUV, Regualr, EV classes extends Spot


public class ParkingFloor {

private int parkingFloorNumber;
private List<Spots> listOfSpots;

ParkingFloor() {
// Initialize list of listOfSpots
}

public boolean addSpot(Spot spot) {
listOfSpots.add(spot);
return true;
}

public boolean removeSpot() {

}
}

public class Ticket {
private int ticketNumber;

private Spot spot;
private Vehical vehical;

Ticket(Spot spot, Vehical vehical) {
this.spot = spot;
this.vehical = vehical;
}

public Vehical getVehical() {
return vehical;
}
}




