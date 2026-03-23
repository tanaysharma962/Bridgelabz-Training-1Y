package Applying_Encapsulation.OnlineFoodDeliverySystem;

public class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = getPrice() * getQuantity();
        return basePrice + 50; // extra charge for non-veg
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.95; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}
