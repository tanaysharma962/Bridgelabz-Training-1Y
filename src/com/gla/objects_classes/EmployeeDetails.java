package objects_classes;

class Employee{
    String name;
    int id;
    double salary;
    void displaydetails(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Salary: "+salary);;
    }
}

public class EmployeeDetails {
    public static void main(String[] args){
        Employee emp1=new Employee();
        emp1.name="Rahul";
        emp1.id=101;
        emp1.salary=50000;
        emp1.displaydetails();
    }
}