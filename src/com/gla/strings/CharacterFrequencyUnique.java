package strings;

import java.util.Scanner;

public class CharacterFrequencyUnique {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int len = text.length();

        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {

            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }


        char[] unique = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            unique[i] = temp[i];
        }


        int[] freq = new int[256];

        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }


        String[][] result = new String[uniqueCount][2];

        for (int i = 0; i < uniqueCount; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }


        System.out.println("\nCharacter   Frequency");
        System.out.println("----------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s %-10s\n", result[i][0], result[i][1]);
        }

        sc.close();
    }
}
