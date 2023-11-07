package LLDCodeProblems.CarRentalSystem.domains.Interfaces;

import LLDCodeProblems.CarRentalSystem.domains.Abstract.Vehicle;

import java.util.List;

public interface Search {
    public List<Vehicle> searchByType(String type);
    public List<Vehicle> searchByModel(String model);
}
