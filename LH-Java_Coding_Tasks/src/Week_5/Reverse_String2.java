package Week_5;

public class Reverse_String2 {

        public static void main(String[] args) {
            String original = "Hello, World!";
            String reversed = reverseString(original);
            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);
        }

        private static String reverseString(String str) {
            if (str.isEmpty()) {
                return str;
            } else {
                return reverseString(str.substring(1)) + str.charAt(0);
            }
        }
    }

