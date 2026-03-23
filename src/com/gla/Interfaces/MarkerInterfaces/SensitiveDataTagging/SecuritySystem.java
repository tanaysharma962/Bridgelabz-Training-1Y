package Interfaces.MarkerInterfaces.SensitiveDataTagging;

public class SecuritySystem {
    public static void main(String[] args) {

        CustomerInfo customer = new CustomerInfo("Amit", "1234-5678-9012");

        SecurityProcessor.process(customer);
    }
}
