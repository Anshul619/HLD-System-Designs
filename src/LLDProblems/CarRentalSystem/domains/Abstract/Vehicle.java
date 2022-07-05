package LLDCodeProblems.CarRentalSystem.domains.Abstract;

import LLDCodeProblems.CarRentalSystem.enums.VehicleStatus;

public abstract class Vehicle {
    private String licenseNumber;
    private String stockNumber;
    private int passengerCapacity;
    private String barcode;
    private boolean hasSunroof;
    private VehicleStatus status;
    private String model;
    private String make;
    private int manufacturingYear;
    private int mileage;

    private List<VehicleLog> log;

    public boolean reserveVehicle();

    public boolean returnVehicle();
}
