package Week_5;

public class Reverse_String {
    public static String reverseString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Reverse the character array in-place
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            // Swap characters at positions i and j
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        // Example usage
        String original = "ABCD";
        String reversed = reverseString(original);

        // Display the result
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}

/*TASK
String -- Reverse
Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
 */
