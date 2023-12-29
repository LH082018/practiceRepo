package Week_7;

public class Maximum_Number {


    public static void main(String[] args) {

        //Array of integer
        // need to find the max number
        int[] nums = {130, 20, 5, 40, -10, 30};

        //declare variable max in order to contain the max number
        //create an assumption that the first element in the array is the maximum number
        //and then you compare the first element with the second element
        int max = nums[0];

        // shortcut nums.fori
        // you will start the iteration from the second element in Array
        for (int i = 1; i < nums.length; i++) {
            //if the element in the nums array at the index[i] is greater
            // than the current max number
            if (nums[i] > max) { //compares the element of the array with the current max number
                //the element is stored in the max variable because
                // max = the nums index[i]
                max = nums[i];
            }
        }
        System.out.println("max number is: " + max);
    }
}






