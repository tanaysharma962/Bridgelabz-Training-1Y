package strings;
import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.next();

        int count = 0;

        for (int i = 0; ; i++) {
            try {
                s.charAt(i);
                count++;
            } catch (Exception e) {
                break;
            }
        }

        System.out.println("Length without using length(): " + count);
        System.out.println("Length using built-in length(): " + s.length());

    }
}
