package strings;

import java.util.Scanner;

class StringIndexDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");

        String text = sc.next();


        try {
            // Accessing index beyond string length
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }


    }
}
