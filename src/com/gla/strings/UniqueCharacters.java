package strings;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();


        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (Exception e) {

        }

        char[] temp = new char[len];
        int count = 0;

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
                temp[count] = ch;
                count++;
            }
        }


        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        System.out.println("Unique Characters:");
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }

        sc.close();
    }
}
