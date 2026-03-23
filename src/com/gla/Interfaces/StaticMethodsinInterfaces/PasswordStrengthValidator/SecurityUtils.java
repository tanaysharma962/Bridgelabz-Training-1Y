package Interfaces.StaticMethodsinInterfaces.PasswordStrengthValidator;

interface SecurityUtils {
    static boolean isStrongPassword(String password) {

        // password must be at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpper = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch))
                hasDigit = true;
            if (Character.isUpperCase(ch))
                hasUpper = true;
        }

        return hasDigit && hasUpper;
    }
}
