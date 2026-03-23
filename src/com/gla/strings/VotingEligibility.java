package strings;

import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int n = 10;

        int[] ages = new int[n];


        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;   // 10 to 99
        }


        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            }
            else if (ages[i] >= 18) {
                result[i][1] = "true";
            }
            else {
                result[i][1] = "false";
            }
        }


        System.out.println("\nAge\tCan Vote?");
        System.out.println("-------------------");

        for (int i = 0; i < n; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }

        sc.close();
    }
}

