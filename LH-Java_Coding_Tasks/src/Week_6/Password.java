package Week_6;

public class Password {

        public static void main(String[] args) {
            String password = "YourPassword123!";
            if (hasSpecialCharacter(password)) {
                System.out.println("Password contains at least one special character.");
            } else {
                System.out.println("Password does not contain any special character.");
            }
        }

        private static boolean hasSpecialCharacter(String password) {
            String specialCharacters = "!@#$%^&+=";
            for (char ch : password.toCharArray()) {
                if (specialCharacters.contains(String.valueOf(ch))) {
                    return true;
                }
            }
            return false;
        }
}
