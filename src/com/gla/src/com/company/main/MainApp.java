package com.company.main;
import com.company.hr.Employee;
import com.company.payroll.Payroll;
public class MainApp {
    public static void main(String[] args){
        Employee e1 = new Employee(101, "Rahul", "IT", 50000);
        Payroll p1 = new Payroll();

        System.out.println("Before Bonus:");
        e1.displayEmployee();

        p1.calculateBonus(e1);
        System.out.println("After 10% Bonus:");
        e1.displayEmployee();
    }
}
