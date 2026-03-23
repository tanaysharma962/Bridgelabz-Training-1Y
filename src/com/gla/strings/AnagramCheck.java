package strings;

import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        if (text1.length() != text2.length()) {
            System.out.println("The texts are NOT Anagrams.");
        } else {

            int[] freq = new int[256];

            for (int i = 0; i < text1.length(); i++) {
                freq[text1.charAt(i)]++;
            }

            for (int i = 0; i < text2.length(); i++) {
                freq[text2.charAt(i)]--;
            }

            boolean isAnagram = true;

            for (int i = 0; i < 256; i++) {
                if (freq[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                System.out.println("The texts are Anagrams.");
            } else {
                System.out.println("The texts are NOT Anagrams.");
            }
        }

        sc.close();
    }
}

