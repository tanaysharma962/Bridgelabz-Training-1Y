package strings;

import java.util.Scanner;

public class ArrayIndexDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }


        try {

            System.out.println(names[n]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }

        System.out.println("Program continues normally");

    }
}
