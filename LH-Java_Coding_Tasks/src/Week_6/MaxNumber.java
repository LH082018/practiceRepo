package Week_6;

public class MaxNumber {

    public static void main(String[] args) {

        int [] numbers = {5,7,8,12,15,24, 32};
        // maxNumber is initialized with the first element of the array
        // this is 'assumed' to be the maxNumber
       int maxNumber = numbers[0];

       // write a for each loop that will iterate over each number in the numbers array
        for (int num : numbers) {

            // if the individual number is greater than the maxNumber
            if( num > maxNumber){
                // if num is greater than maxNumber - the maxNumber is updated to the value of num
              maxNumber=num;
            }
        }

        System.out.println(maxNumber);

    }






    }

    /*TASK
    Write a method that can find the maximum number from an int Array
     */

