package strings;

import java.util.Scanner;

class IllegalArgumentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");

        String text = sc.next();


        try {

            System.out.println(text.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }


    }
}

