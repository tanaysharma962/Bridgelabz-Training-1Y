package Interfaces.ImplementingInterfaces.DigitalPaymentInterface;

public class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}
