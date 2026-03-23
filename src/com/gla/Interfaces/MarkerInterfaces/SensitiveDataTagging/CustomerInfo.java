package Interfaces.MarkerInterfaces.SensitiveDataTagging;

public class CustomerInfo implements SensitiveData {
    String name;
    String creditCard;

    CustomerInfo(String name, String creditCard) {
        this.name = name;
        this.creditCard = creditCard;
    }
}
