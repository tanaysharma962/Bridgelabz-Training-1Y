package javapractice;
class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }
}

class EBook extends Book {
    double fileSize; // in MB

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println();
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        Book b1 = new Book("978-0135166307", "Java Programming", "James Gosling");
        b1.displayBook();

        b1.setAuthor("Herbert Schildt");
        b1.displayBook();

        EBook e1 = new EBook("978-0321356680", "Effective Java", "Joshua Bloch", 5.5);
        e1.displayEBook();
    }
}