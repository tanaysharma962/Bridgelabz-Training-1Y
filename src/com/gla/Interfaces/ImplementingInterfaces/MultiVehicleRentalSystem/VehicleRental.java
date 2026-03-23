package Interfaces.ImplementingInterfaces.MultiVehicleRentalSystem;

public class VehicleRental {
    public static void main(String[] args) {

        RentalVehicle v1 = new Car();
        RentalVehicle v2 = new Bike();
        RentalVehicle v3 = new Bus();

        v1.rent();
        v2.rent();
        v3.rent();

        v1.returnVehicle();
        v2.returnVehicle();
        v3.returnVehicle();
    }
}
