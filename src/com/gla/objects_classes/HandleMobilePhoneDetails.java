package objects_classes;
class MobilePhone {
    String brand;
    String model;
    double price;
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
public class HandleMobilePhoneDetails {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();

        phone.brand = "Samsung";
        phone.model = "Galaxy S21";
        phone.price = 65000;

        phone.displayDetails();
    }
}
