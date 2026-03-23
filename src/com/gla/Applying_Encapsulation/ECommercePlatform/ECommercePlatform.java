package Applying_Encapsulation.ECommercePlatform;
import java.util.ArrayList;
import java.util.List;
public class ECommercePlatform {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        Product p1 = new Electronics(101, "Laptop", 60000);
        Product p2 = new Clothing(102, "T-Shirt", 1000);
        Product p3 = new Groceries(103, "Rice", 500);

        products.add(p1);
        products.add(p2);
        products.add(p3);

        for (Product p : products) {

            p.displayProduct();

            System.out.println("Discount: " + p.calculateDiscount());

            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                System.out.println("Tax: " + t.calculateTax());
                System.out.println(t.getTaxDetails());
            }

            System.out.println("-----------------------");
        }
    }
}
