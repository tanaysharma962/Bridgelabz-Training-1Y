package strings;

import java.util.Scanner;

public class TrimWithoutMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string with spaces:");
        String text = sc.nextLine();

        int length = text.length();


        int start = 0;
        while (start < length && text.charAt(start) == ' ') {
            start++;
        }


        int end = length - 1;
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }


        int newSize = end - start + 1;

        char[] manualTrim = new char[newSize];

        int index = 0;
        for (int i = start; i <= end; i++) {
            manualTrim[index++] = text.charAt(i);
        }


        String builtInTrim = text.trim();


        boolean same = true;

        if (manualTrim.length != builtInTrim.length()) {
            same = false;
        } else {
            for (int i = 0; i < manualTrim.length; i++) {
                if (manualTrim[i] != builtInTrim.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }


        System.out.print("\nManual Trim Result: '");
        for (int i = 0; i < manualTrim.length; i++) {
            System.out.print(manualTrim[i]);
        }
        System.out.println("'");

        System.out.println("Built-in Trim Result: '" + builtInTrim + "'");
        System.out.println("Are both results same? " + same);

        sc.close();
    }
}

