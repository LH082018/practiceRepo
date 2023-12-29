package Week_1;

public class Task1_OddEven {

    public static String oddEven(int num){

        // if the number is divisible by 2 and returns 0 it is an even number
        if(num%2==0){
            return "This number is an even number!";

            // else it is an odd number
        }else{
            return "This number is very odd!";
        }

    }
    public static void main(String[] args) {

        System.out.println("oddEven() Is the number odd or even? = " + oddEven(5));

    }
}

/* Task
Write a method which can identify if the given number is odd or even

// additional task - set a pre-condition
 */
