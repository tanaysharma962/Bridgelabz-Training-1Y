package objects_classes;
class Student {
    String name;
    int rollNumber;
    int marks;
    String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Assign values
        s1.name = "Amit";
        s1.rollNumber = 101;
        s1.marks = 85;

        s1.displayDetails();
    }
}