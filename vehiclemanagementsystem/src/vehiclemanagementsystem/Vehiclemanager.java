package vehiclemanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class Vehiclemanager {

	private List<Vehicle> vehicles;

    public Vehiclemanager() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return vehicles;
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

}
