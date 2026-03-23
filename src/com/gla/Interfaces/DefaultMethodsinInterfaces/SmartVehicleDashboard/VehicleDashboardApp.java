package Interfaces.DefaultMethodsinInterfaces.SmartVehicleDashboard;

public class VehicleDashboardApp {

    public static void main(String[] args) {

        VehicleDashboard v1 = new PetrolCar();
        VehicleDashboard v2 = new ElectricCar();

        v1.displaySpeed(80);
        v1.displayBattery();

        v2.displaySpeed(100);
        v2.displayBattery();
    }
}
