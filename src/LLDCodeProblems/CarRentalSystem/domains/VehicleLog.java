package LLDCodeProblems.CarRentalSystem.domains;

import LLDCodeProblems.CarRentalSystem.enums.VehicleLogType;

import java.util.Date;
import java.util.List;

public class VehicleLog {
    private String id;
    private VehicleLogType type;
    private String description;
    private Date creationDate;

    public boolean update() {
        return false;
    }

    public List<VehicleLogType> searchByLogType(VehicleLogType type) {
        return null;
    }
}
