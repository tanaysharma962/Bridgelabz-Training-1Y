package javapractice;
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if(CGPA >= 0.0 && CGPA <= 10.0) {  // validate CGPA
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value!");
        }
    }

    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
        System.out.println();
    }
}

class PostgraduateStudent extends Student {

    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }
}

public class Students {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 8.5);
        s1.displayStudent();

        s1.setCGPA(9.0);
        s1.displayStudent();

        PostgraduateStudent p1 = new PostgraduateStudent(201, "Alice", 9.2, "Computer Science");
        p1.displayPostgraduateStudent();
    }
}