package Models;

import Interfaces.Speed;

public class Helicopter extends Vehicle implements Speed {

    private String engineCapacity;
    public Helicopter(String name, String travelMedium, boolean publicTravel, int maxOccupancy, int numberOfWheels,
                      int price) {
        super(name, travelMedium, publicTravel, maxOccupancy, numberOfWheels, price);
    }

    @Override
    public String carDescription() {
        return "This is an " + this.travelMedium + " vehicle.";
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String speed(int topSpeed) {
        return this.name + " top speed is " + topSpeed + " km/h!";
    }
}
