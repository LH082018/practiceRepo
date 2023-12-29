package Week_4;

/*TASK
String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

import java.util.Scanner;

public class FrequencyChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = input.next();

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            // if each character is equal to the char input
            if (eachChar == ch) {
                //store the char frequency in the variable frequency
                frequency++;
            }
        }

        System.out.println(frequency);

        input.close();

    }
}
