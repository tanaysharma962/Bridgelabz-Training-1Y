package Interfaces.DefaultMethodsinInterfaces.PaymentGatewayIntegration;

public interface PaymentProcessor {

    void processPayment(double amount);

    // Default method
    default void refund(double amount) {
        System.out.println("Refund processed: " + amount);
    }
}
