package Applying_Encapsulation.RideHailingApplication;

public class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(int id, String driver, double rate, String location) {
        super(id, driver, rate);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm * 0.9; // cheaper than car
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
    }

}
