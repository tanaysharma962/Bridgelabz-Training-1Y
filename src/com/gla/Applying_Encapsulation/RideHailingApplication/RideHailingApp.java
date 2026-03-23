package Applying_Encapsulation.RideHailingApplication;
import java.util.ArrayList;
public class RideHailingApp {
        public static void main(String[] args) {

            ArrayList<Vehicle> vehicles = new ArrayList<>();

            vehicles.add(new Car(101, "Rahul", 15, "City Center"));
            vehicles.add(new Bike(201, "Amit", 10, "Bus Stand"));
            vehicles.add(new Auto(301, "Suresh", 12, "Railway Station"));

            double distance = 10;

            for (Vehicle v : vehicles) {

                System.out.println("\nVehicle Details:");
                v.getVehicleDetails();

                double fare = v.calculateFare(distance);
                System.out.println("Fare for " + distance + " km: " + fare);

                GPS gps = (GPS) v;
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }
        }
}
