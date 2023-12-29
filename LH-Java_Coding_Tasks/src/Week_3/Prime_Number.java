package Week_3;

public class Prime_Number {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            // Numbers less than or equal to 1 are not prime numbers
            return false;
        }

        // Check for factors up to half of the number
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                // If a factor is found, the number is not prime
                return false;
            }
        }

        // If no factors are found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        // Example usage
        int number = 17;

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

}
