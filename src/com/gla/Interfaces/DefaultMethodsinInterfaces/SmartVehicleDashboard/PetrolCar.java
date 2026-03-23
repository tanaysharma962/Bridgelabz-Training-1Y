package Interfaces.DefaultMethodsinInterfaces.SmartVehicleDashboard;

public class PetrolCar implements VehicleDashboard {
    public void displaySpeed(int speed) {
        System.out.println("Car Speed: " + speed + " km/h");
    }
}

class ElectricCar implements VehicleDashboard {

    public void displaySpeed(int speed) {
        System.out.println("Electric Car Speed: " + speed + " km/h");
    }

    // Overriding default method
    public void displayBattery() {
        System.out.println("Battery Level: 85%");
    }
}
