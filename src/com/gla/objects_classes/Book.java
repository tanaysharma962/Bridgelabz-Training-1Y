package javapractice;
class Books {
    String title;
    String author;
    double price;

    Books() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Books(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Books b1 = new Books();

        Books b2 = new Books("Java Programming", "James Gosling", 500);

        b1.display();
        b2.display();
    }
}