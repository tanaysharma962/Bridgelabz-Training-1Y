package Applying_Encapsulation.VehicleRentalSystem;
import java.util.ArrayList;
public class VehicleRentalSystem {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000, "CARINS123"));
        vehicles.add(new Bike("BIKE201", 500, "BIKEINS456"));
        vehicles.add(new Truck("TRK301", 4000, "TRUCKINS789"));

        int rentalDays = 3;

        for (Vehicle v : vehicles) {

            System.out.println("\nVehicle Number: " + v.getVehicleNumber());
            System.out.println("Vehicle Type: " + v.getType());

            double rentalCost = v.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);

            Insurable ins = (Insurable) v;

            System.out.println("Insurance Cost: " + ins.calculateInsurance());
            System.out.println(ins.getInsuranceDetails());
        }
    }
}
