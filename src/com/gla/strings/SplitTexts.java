package strings;

import java.util.Scanner;

public class SplitTexts {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = sc.nextLine();

        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (Exception e) {

        }

        int wordCount = 0;

        for (int i = 0; i < length; i++) {
            if (i == 0 && text.charAt(i) != ' ') {
                wordCount++;
            }
            else if (text.charAt(i) != ' ' && text.charAt(i - 1) == ' ') {
                wordCount++;
            }
        }

        String[] manualWords = new String[wordCount];

        int index = 0;
        for (int i = 0; i < length; i++) {

            if (i == 0 && text.charAt(i) != ' ') {
                String word = "";
                int j = i;

                while (j < length && text.charAt(j) != ' ') {
                    word = word + text.charAt(j);
                    j++;
                }

                manualWords[index++] = word;
            }

            else if (text.charAt(i) != ' ' && text.charAt(i - 1) == ' ') {
                String word = "";
                int j = i;

                while (j < length && text.charAt(j) != ' ') {
                    word = word + text.charAt(j);
                    j++;
                }

                manualWords[index++] = word;
            }
        }


        String[] builtinWords = text.split(" ");


        System.out.println("\nManual Split Result:");
        for (int i = 0; i < manualWords.length; i++) {
            System.out.println(manualWords[i]);
        }


        System.out.println("\nBuilt-in Split Result:");
        for (int i = 0; i < builtinWords.length; i++) {
            System.out.println(builtinWords[i]);
        }

        boolean same = true;

        if (manualWords.length != builtinWords.length) {
            same = false;
        } else {
            for (int i = 0; i < manualWords.length; i++) {
                if (!manualWords[i].equals(builtinWords[i])) {
                    same = false;
                    break;
                }
            }
        }

        System.out.println("\nAre both results same? " + same);

        sc.close();
    }
}
