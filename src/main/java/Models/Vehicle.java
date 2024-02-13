package Models;

public abstract class Vehicle {

    protected String name;
    protected String travelMedium;
    private boolean publicTravel;
    private int maxOccupancy;
    private int numberOfWheels;
    private int price;
//    private enum fuelType {
//        Diesel, Petrol, Electric
//    }

    public Vehicle (String name, String travelMedium, boolean publicTravel, int maxOccupancy, int numberOfWheels,
                    int price) {
        this.name = name;
        this.travelMedium = travelMedium;
        this.publicTravel = publicTravel;
        this.maxOccupancy = maxOccupancy;
        this.numberOfWheels = numberOfWheels;
        this.price = price;
    }

    public String carDescription() {
        return "This is a vehicle.";
    }

}
