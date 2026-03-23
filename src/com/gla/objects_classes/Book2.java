package javapractice;
class Book2 {
    String title;
    String author;
    double price;
    boolean availability;

    Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; // book is available by default
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
        System.out.println();
    }

    public static void main(String[] args) {
        Book2 b1 = new Book2("Java Programming", "James Gosling", 500);
        Book2 b2 = new Book2("Data Structures", "Robert Lafore", 400);

        b1.displayBook();
        b2.displayBook();

        b1.borrowBook();
        b1.borrowBook();
        b2.borrowBook();

        b1.displayBook();
        b2.displayBook();
    }
}