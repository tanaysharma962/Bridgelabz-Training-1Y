package strings;

import java.util.Scanner;

public class NumberFormatDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String text = sc.next();


        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
            System.out.println("Input is not a valid number");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }

        System.out.println("Program ends normally");
    }
}
