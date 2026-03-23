package Applying_Encapsulation.LibraryManagementSystem;

public class DVD extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrowerName;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days loan
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            available = false;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
