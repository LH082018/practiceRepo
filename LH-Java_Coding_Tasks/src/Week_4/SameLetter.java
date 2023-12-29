package Week_4;

/*TASK
String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */

import java.util.Arrays;


public class SameLetter {

    public static boolean areSameLetters(String str1, String str2) {
        // Convert the strings to lowercase to make the comparison case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Convert strings to char arrays, sort them, and then compare
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted characters of both arrays are the same
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        // Example usage:
        boolean result1 = areSameLetters("abc", "cab");
        System.out.println(result1);  // Output: true

        boolean result2 = areSameLetters("abc", "abb");
        System.out.println(result2);  // Output: false
    }
}


