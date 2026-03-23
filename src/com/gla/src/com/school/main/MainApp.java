package com.school.main;
import com.school.data.*;
import com.school.util.*;
public class MainApp {
    public static void main(String[] args){
        Student s1 = new Student("Rahul", 85, 90, 78);
        Analyzer a1 = new Analyzer();

        double avg = a1.calculateAverage(s1);
        String grade = a1.findGrade(avg);

        System.out.println(s1);
        System.out.println("Average: " + avg + ", Grade: " + grade);
    }
}
