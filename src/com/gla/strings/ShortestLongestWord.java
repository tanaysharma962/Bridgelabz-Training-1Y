package strings;

import java.util.Scanner;

public class ShortestLongestWord {

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


        String[][] data = new String[wordCount][2];

        for (int i = 0; i < wordCount; i++) {

            int wordLength = 0;

            try {
                while (true) {
                    words[i].charAt(wordLength);
                    wordLength++;
                }
            } catch (Exception e) {
            }

            data[i][0] = words[i];
            data[i][1] = String.valueOf(wordLength);
        }


        int minIndex = 0;
        int maxIndex = 0;

        int minLength = Integer.parseInt(data[0][1]);
        int maxLength = Integer.parseInt(data[0][1]);

        for (int i = 1; i < data.length; i++) {

            int currentLength = Integer.parseInt(data[i][1]);

            if (currentLength < minLength) {
                minLength = currentLength;
                minIndex = i;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxIndex = i;
            }
        }


        System.out.println("\nShortest Word: "
                + data[minIndex][0]
                + " (Length: " + data[minIndex][1] + ")");

        System.out.println("Longest Word: "
                + data[maxIndex][0]
                + " (Length: " + data[maxIndex][1] + ")");

        sc.close();
    }
}

