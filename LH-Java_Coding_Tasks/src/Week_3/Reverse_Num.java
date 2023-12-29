package Week_3;

public class Reverse_Num {
    public static int reverseNegativeNumber(int number) {
        if (number >= 0) {
            // Non-negative numbers remain unchanged
            return number;
        }

        // Remove the negative sign and reverse the positive part manually
        String absString = Integer.toString(-number);
        char[] reversedChars = new char[absString.length()];

        for (int i = 0; i < absString.length(); i++) {
            reversedChars[i] = absString.charAt(absString.length() - 1 - i);
        }

        // Convert the reversed characters back to an integer with the negative sign
        int reversedNumber = Integer.parseInt(new String(reversedChars)) * -1;

        return reversedNumber;
    }

    public static void main(String[] args) {
        // Example usage
        int originalNumber = -12345;
        int reversedNumber = reverseNegativeNumber(originalNumber);

        // Display the result
        System.out.println("Original: " + originalNumber);
        System.out.println("Reversed: " + reversedNumber);
    }
}
