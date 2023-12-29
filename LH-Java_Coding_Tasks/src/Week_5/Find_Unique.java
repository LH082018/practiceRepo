package Week_5;

//Hashset It removes the duplicates because it is a set
import java.util.HashSet;

//The Scanner class is used to read input from the user.
import java.util.Scanner;
import java.util.Set;

public class Find_Unique {
    public static String findUniqueCharacters(String input) {
        // Use a set to store unique characters
        Set<Character> uniqueChars = new HashSet<>();

        // Iterate through each character in the string
        for (char ch : input.toCharArray()) {
            // Check if the character is not already in the set
            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                // Add the unique character to the set
                uniqueChars.add(ch);
            }
        }


        // Concatenate characters to form the result string
        String result = "";
        for (Character ch : uniqueChars) {
            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {
        // Use Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();

        // Call the method to find unique characters
        String result = findUniqueCharacters(inputStr);

        // Display the result
        System.out.println("Input: " + inputStr);
        System.out.println("Unique characters: " + result);

        // Close the scanner
        scanner.close();
    }
}


/*TASK
String -- Find the unique
Write a return method that can find the unique characters from the String Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */
