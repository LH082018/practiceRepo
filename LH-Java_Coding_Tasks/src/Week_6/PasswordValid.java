package Week_6;

public class PasswordValid {
    public static void main(String[] args) {
        String password = "Password123";
        boolean isValid = isValidPassword(password);
        System.out.println("Is the password valid? " + isValid);
    }

    // Method to validate a password
    public static boolean isValidPassword(String password) {
        // Check for minimum length and no space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Check for at least one upper case letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Check for at least one lower case letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Check for at least one special character
        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            return false;
        }

        // Check for at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // If all conditions are met, the password is valid
        return true;
    }
}
