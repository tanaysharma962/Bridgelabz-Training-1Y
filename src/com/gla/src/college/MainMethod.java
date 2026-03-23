package college;
import college.student.Student;
import college.faculty.Faculty;

public class MainMethod {
    public static void main(String[] args){
        Student s1 = new Student("Rahul", 101);
        Faculty f1 = new Faculty("Dr. Smith", "Mathematics");

        s1.displayStudent();
        System.out.println();
        f1.displayFaculty();
    }
}