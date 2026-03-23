package Applying_Encapsulation.LibraryManagementSystem;
import java.util.ArrayList;
public class LibraryManagementSystem {
    public static void main(String[] args) {

        ArrayList<LibraryItem> items = new ArrayList<>();

        items.add(new Book(101, "Java Programming", "James Gosling"));
        items.add(new Magazine(201, "Tech Today", "Editorial Team"));
        items.add(new DVD(301, "Learning Java", "Programming Studio"));

        for (LibraryItem item : items) {

            System.out.println("\nItem Details:");
            item.getItemDetails();

            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            Reservable r = (Reservable) item;

            if (r.checkAvailability()) {
                r.reserveItem("Rahul");
            }
        }
    }
}
