package javapractice;
class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

class Manager extends Employee {
    String teamName;

    Manager(String employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManager() {
        System.out.println("Employee ID: " + employeeID);     // public
        System.out.println("Department: " + department);     // protected
        System.out.println("Salary: " + getSalary());        // private, accessed via getter
        System.out.println("Team Name: " + teamName);
        System.out.println();
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee e1 = new Employee("E101", "IT", 50000);
        e1.displayEmployee();

        e1.setSalary(55000);
        e1.displayEmployee();

        Manager m1 = new Manager("M201", "HR", 75000, "Recruitment Team");
        m1.displayManager();
    }
}