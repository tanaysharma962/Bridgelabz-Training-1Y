package strings;

import java.util.Random;

public class StudentGradeSystem {

    public static void main(String[] args) {

        int students = 5;   // number of students
        int[][] marks = new int[students][3];  // Physics, Chemistry, Math
        double[][] result = new double[students][3];


        Random rand = new Random();


        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = rand.nextInt(90) + 10;
            }
        }


        for (int i = 0; i < students; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }


        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Student\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < students; i++) {

            String grade;

            if (result[i][2] >= 80)
                grade = "A";
            else if (result[i][2] >= 70)
                grade = "B";
            else if (result[i][2] >= 60)
                grade = "C";
            else if (result[i][2] >= 50)
                grade = "D";
            else if (result[i][2] >= 40)
                grade = "E";
            else
                grade = "R";

            System.out.println((i + 1) + "\t"
                    + marks[i][0] + "\t"
                    + marks[i][1] + "\t"
                    + marks[i][2] + "\t"
                    + (int) result[i][0] + "\t"
                    + result[i][1] + "\t"
                    + result[i][2] + "\t"
                    + grade);
        }

        System.out.println("-----------------------------------------------------------------------");
    }
}

