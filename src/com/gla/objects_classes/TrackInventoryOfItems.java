package objects_classes;
class Item {
    int itemCode;
    String itemName;
    double price;
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
    double totalCost(int quantity) {
        return price * quantity;
    }
}


public class TrackInventoryOfItems {
    public static void main(String[] args) {
        Item item = new Item();

        // Assign values
        item.itemCode = 101;
        item.itemName = "Pen";
        item.price = 10;

        // Display details
        item.displayDetails();

        int quantity = 5;
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + item.totalCost(quantity));
    }
}
