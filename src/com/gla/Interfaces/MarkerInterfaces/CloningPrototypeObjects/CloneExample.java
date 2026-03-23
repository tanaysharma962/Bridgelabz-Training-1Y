package Interfaces.MarkerInterfaces.CloningPrototypeObjects;

public class CloneExample {
    public static void main(String[] args) throws Exception {

        Product p1 = new Product(1, "Laptop");

        Product p2 = (Product) p1.clone();

        System.out.println("Original: " + p1.name);
        System.out.println("Cloned: " + p2.name);
    }
}
