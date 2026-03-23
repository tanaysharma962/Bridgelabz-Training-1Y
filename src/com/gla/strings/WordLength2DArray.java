package strings;

import java.util.Scanner;

public class WordLength2DArray {

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


        String[] words = new String[wordCount];
        int index = 0;

        for (int i = 0; i < length; i++) {

            if ((i == 0 && text.charAt(i) != ' ') ||
                    (i > 0 && text.charAt(i) != ' ' && text.charAt(i - 1) == ' ')) {

                String word = "";
                int j = i;

                while (j < length && text.charAt(j) != ' ') {
                    word = word + text.charAt(j);
                    j++;
                }

                words[index++] = word;
            }
        }


        String[][] result = new String[wordCount][2];

        for (int i = 0; i < wordCount; i++) {

            // Find word length without using length()
            int wordLength = 0;
            try {
                while (true) {
                    words[i].charAt(wordLength);
                    wordLength++;
                }
            } catch (Exception e) {
            }

            result[i][0] = words[i];
            result[i][1] = String.valueOf(wordLength);
        }


        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < result.length; i++) {

            String word = result[i][0];
            int len = Integer.parseInt(result[i][1]);  // Convert String → Integer

            System.out.println(word + "\t" + len);
        }

        sc.close();
    }
}

