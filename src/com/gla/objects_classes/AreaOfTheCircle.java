package objects_classes;

class Circle{
    double
    radius;
    double area(){
        return Math.PI*radius*radius;
    }
    double circumference(){
        return 2*Math.PI*radius;
    }
    void displayresullt(){
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+area());
        System.out.println("Circumference: "+circumference());
    }
}
public class AreaOfTheCircle {
    public static void main(String[] args){
        Circle c=new Circle();
        c.radius=5;
        c.displayresullt();
    }
}
