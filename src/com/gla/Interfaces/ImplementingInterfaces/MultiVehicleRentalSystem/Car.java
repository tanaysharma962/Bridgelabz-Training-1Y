package Interfaces.ImplementingInterfaces.MultiVehicleRentalSystem;

public class Car implements RentalVehicle {
    public void rent() {
        System.out.println("Car rented successfully");
    }

    public void returnVehicle() {
        System.out.println("Car returned");
    }
}
