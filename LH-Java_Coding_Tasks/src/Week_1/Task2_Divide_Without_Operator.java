package Week_1;
import java.util.Scanner;
public class Task2_Divide_Without_Operator {
    public static void main(String[] args) {
        int a,b,c;
        int result =0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = input.nextInt();

        System.out.println("Enter second number: ");
        b = input.nextInt();

        // for example a is 40 and b is 4
        c=a+b;  // c = 44

        // while b is greater than b execute the while loop
        while(c>b){ // c= 44 --> b = 4
            c=c-b;  //
            result++; // the total number of iterations are saved in the result variable
        }
        System.out.println("The first number: " + a + " divided by the second number: " + b + " = " + result);
    }
}

/*TASK
Write a method that can divide two numbers without using the division operator
 */
