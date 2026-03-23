package strings;

import java.util.Scanner;

public class PalindromeCheck {


    static boolean recursiveCheck(String text, int start, int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return recursiveCheck(text, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        int len = text.length();


        boolean iterativeResult = true;
        int start = 0;
        int end = len - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                iterativeResult = false;
                break;
            }

            start++;
            end--;
        }


        boolean recursiveResult = recursiveCheck(text, 0, len - 1);


        char[] original = text.toCharArray();
        char[] reverse = new char[len];

        for (int i = 0; i < len; i++) {
            reverse[i] = text.charAt(len - 1 - i);
        }

        boolean arrayResult = true;

        for (int i = 0; i < len; i++) {
            if (original[i] != reverse[i]) {
                arrayResult = false;
                break;
            }
        }


        System.out.println("\nUsing Iterative Method: " + iterativeResult);
        System.out.println("Using Recursive Method: " + recursiveResult);
        System.out.println("Using Array Method: " + arrayResult);

        sc.close();
    }
}

