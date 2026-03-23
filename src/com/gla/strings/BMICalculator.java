package strings;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];
        String[][] result = new String[10][4];

        System.out.println("Enter Weight (kg) and Height (cm) for 10 Persons:\n");


        for (int i = 0; i < 10; i++) {

            System.out.println("Person " + (i + 1));

            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();

            System.out.println();
        }


        for (int i = 0; i < 10; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightMeter = heightCm / 100.0;
            double bmi = weight / (heightMeter * heightMeter);

            String status;

            if (bmi < 18.5) {
                status = "Underweight";
            }
            else if (bmi < 24.9) {
                status = "Normal";
            }
            else if (bmi < 29.9) {
                status = "Overweight";
            }
            else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }


        System.out.println("\n-------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n",
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]);
        }

        System.out.println("-------------------------------------------------------------");

        sc.close();
    }
}

