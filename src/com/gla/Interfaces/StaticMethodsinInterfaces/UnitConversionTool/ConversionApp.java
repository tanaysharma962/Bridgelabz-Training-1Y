package Interfaces.StaticMethodsinInterfaces.UnitConversionTool;

public class ConversionApp {

    public static void main(String[] args) {

        double km = 10;
        double kg = 5;

        System.out.println("Km to Miles: " + UnitConverter.kmToMiles(km));
        System.out.println("Kg to Pounds: " + UnitConverter.kgToLbs(kg));
    }
}
