package Interfaces.ImplementingInterfaces.MultiVehicleRentalSystem;

public class Bus implements RentalVehicle {
    public void rent() {
        System.out.println("Bus rented successfully");
    }

    public void returnVehicle() {
        System.out.println("Bus returned");
    }
}
