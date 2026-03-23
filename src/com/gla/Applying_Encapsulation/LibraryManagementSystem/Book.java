package Applying_Encapsulation.LibraryManagementSystem;

public class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrowerName;   // Encapsulated data

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days loan
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            available = false;
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
