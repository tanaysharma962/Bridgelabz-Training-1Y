package Applying_Encapsulation.EmployeeManagementSystem;
import java.util.Scanner;
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        Employee emp = new Employee(id, name, salary);

        emp.assignDepartment(dept);

        System.out.println("\nEmployee Details:");
        emp.displayEmployeeDetails();

    }
}
