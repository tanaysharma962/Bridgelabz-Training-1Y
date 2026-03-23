package Interfaces.FunctionalInterfaces.StringLengthChecker;
import java.util.function.Function;
public class StringLengthChecker {
    public static void main(String[] args) {

        String message = "Welcome to Java Programming";

        // Function to calculate length
        Function<String, Integer> lengthFunction = str -> str.length();

        int length = lengthFunction.apply(message);

        System.out.println("Message: " + message);
        System.out.println("Length: " + length);
    }
}
