package Applying_Encapsulation.EmployeeManagementSystem;

public class Employee implements Department{
    // Encapsulation (private variables)
    private int empId;
    private String empName;
    private double salary;
    private String department;

    // Constructor
    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Getter and Setter methods
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Interface method implementation
    @Override
    public void assignDepartment(String deptName) {
        department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    // Display Employee Details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}
