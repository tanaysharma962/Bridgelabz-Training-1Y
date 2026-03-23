package Interfaces.StaticMethodsinInterfaces.PasswordStrengthValidator;

public class PasswordValidator {
    public static void main(String[] args) {

        String password = "Java1234";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
