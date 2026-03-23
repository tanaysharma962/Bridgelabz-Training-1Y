package Interfaces.ImplementingInterfaces.MultiVehicleRentalSystem;

public class Bike implements RentalVehicle {
    public void rent() {
        System.out.println("Bike rented successfully");
    }

    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}
