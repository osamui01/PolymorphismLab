package Models;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<Vehicle> vehicles;

    public Dealership (String dealershipName) {
        this.name =  dealershipName;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public int vehicleStockCount () {
        return this.vehicles.size();
    }
}
