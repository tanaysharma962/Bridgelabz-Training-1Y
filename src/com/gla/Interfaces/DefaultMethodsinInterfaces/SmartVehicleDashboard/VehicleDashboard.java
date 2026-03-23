package Interfaces.DefaultMethodsinInterfaces.SmartVehicleDashboard;

public interface VehicleDashboard {
    void displaySpeed(int speed);

    // Default method
    default void displayBattery() {
        System.out.println("Battery info not available");
    }
}
