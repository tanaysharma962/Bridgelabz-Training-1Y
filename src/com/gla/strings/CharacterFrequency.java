package strings;

import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int[] freq = new int[256];


        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }


        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }


        String[][] result = new String[uniqueCount][2];

        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }


        System.out.println("\nCharacter   Frequency");
        System.out.println("----------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s %-10s\n", result[i][0], result[i][1]);
        }

        sc.close();
    }
}
