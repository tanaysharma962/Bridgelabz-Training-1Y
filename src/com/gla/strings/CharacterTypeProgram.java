package strings;

import java.util.Scanner;

public class CharacterTypeProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        int length = text.length();


        char[][] result = new char[length][2];

        for (int i = 0; i < length; i++) {

            char ch = text.charAt(i);
            result[i][0] = ch;


            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }


            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {

                    result[i][1] = 'V';   // Vowel
                } else {
                    result[i][1] = 'C';   // Consonant
                }

            } else {
                result[i][1] = 'N';       // Not a Letter
            }
        }


        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");

        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i][0] + "\t\t");

            if (result[i][1] == 'V')
                System.out.println("Vowel");
            else if (result[i][1] == 'C')
                System.out.println("Consonant");
            else
                System.out.println("Not a Letter");
        }

        sc.close();
    }
}

