package Applying_Encapsulation.RideHailingApplication;

public class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(int id, String driver, double rate, String location) {
        super(id, driver, rate);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm * 0.8;
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
