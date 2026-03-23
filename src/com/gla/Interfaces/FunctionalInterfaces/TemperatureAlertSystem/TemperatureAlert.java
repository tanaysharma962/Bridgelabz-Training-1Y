package Interfaces.FunctionalInterfaces.TemperatureAlertSystem;
import java.util.function.Predicate;
public class TemperatureAlert {
    public static void main(String[] args) {

        double temperature = 38.5;

        // Predicate to check temperature
        Predicate<Double> highTemp = t -> t > 37.0;

        if (highTemp.test(temperature)) {
            System.out.println("Alert! High Temperature: " + temperature);
        } else {
            System.out.println("Temperature Normal: " + temperature);
        }
    }
}
