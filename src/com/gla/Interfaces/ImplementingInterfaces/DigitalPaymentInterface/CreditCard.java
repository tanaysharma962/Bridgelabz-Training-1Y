package Interfaces.ImplementingInterfaces.DigitalPaymentInterface;

public class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
}
