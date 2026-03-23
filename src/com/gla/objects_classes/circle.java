package javapractice;
class Circle {
    double radius;

    Circle() {
        this(1.0); // calls parameterized constructor
    }

    Circle(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

        c1.display();
        c2.display();
    }
}