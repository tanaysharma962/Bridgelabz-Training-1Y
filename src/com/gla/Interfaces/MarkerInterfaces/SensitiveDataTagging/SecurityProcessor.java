package Interfaces.MarkerInterfaces.SensitiveDataTagging;

public class SecurityProcessor {
    public static void process(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
        } else {
            System.out.println("No encryption needed.");
        }
    }
}
