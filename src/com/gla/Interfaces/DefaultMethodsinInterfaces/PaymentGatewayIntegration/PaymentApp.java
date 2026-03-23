package Interfaces.DefaultMethodsinInterfaces.PaymentGatewayIntegration;

public class PaymentApp {
    public static void main(String[] args) {

        PaymentProcessor p1 = new PayPalPayment();
        PaymentProcessor p2 = new CreditCardPayment();

        p1.processPayment(500);
        p1.refund(200);

        p2.processPayment(800);
        p2.refund(300);
    }
}
