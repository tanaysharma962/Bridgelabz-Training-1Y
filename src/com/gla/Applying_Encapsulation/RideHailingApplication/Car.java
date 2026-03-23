package Applying_Encapsulation.RideHailingApplication;

public class Car extends Vehicle implements GPS {
    private String location;

    public Car(int id, String driver, double rate, String location) {
        super(id, driver, rate);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
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
