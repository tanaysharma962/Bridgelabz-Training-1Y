package Interfaces.DefaultMethodsinInterfaces.PaymentGatewayIntegration;

public class PayPalPayment implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment processed via PayPal: " + amount);
    }
}

class CreditCardPayment implements PaymentProcessor {

    public void processPayment(double amount) {
        System.out.println("Payment processed via Credit Card: " + amount);
    }
}
