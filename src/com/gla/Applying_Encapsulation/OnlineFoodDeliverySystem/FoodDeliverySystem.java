package Applying_Encapsulation.OnlineFoodDeliverySystem;
import java.util.ArrayList;
public class FoodDeliverySystem {
    public static void main(String[] args) {

        ArrayList<FoodItem> orderList = new ArrayList<>();

        orderList.add(new VegItem("Paneer Pizza", 250, 2));
        orderList.add(new NonVegItem("Chicken Burger", 180, 3));

        for (FoodItem item : orderList) {

            System.out.println("\nFood Item Details:");
            item.getItemDetails();

            double total = item.calculateTotalPrice();
            System.out.println("Total Price: " + total);

            Discountable d = (Discountable) item;

            double finalPrice = d.applyDiscount(total);

            System.out.println(d.getDiscountDetails());
            System.out.println("Final Price After Discount: " + finalPrice);
        }
    }
}

