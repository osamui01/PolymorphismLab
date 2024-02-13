package Models;

public class RangeRover extends Vehicle {

    private String paintColour;

    public RangeRover(String name, String travelMedium, boolean publicTravel, int maxOccupancy,
                      int numberOfWheels, int price) {
        super(name, travelMedium, publicTravel, maxOccupancy, numberOfWheels, price);


    }

    @Override
    public String carDescription () {
        return "This is a " + this.travelMedium + " vehicle.";
    }

    public String carDescription (String model) {
        return "Range Rover " + model;
    }

    public String getPaintColour() {
        return paintColour;
    }

    public void setPaintColour(String paintColour) {
        this.paintColour = paintColour;
    }
}
