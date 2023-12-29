package Week_7;

import java.util.Arrays;

public class Sort_Ascending {
    public static void main(String[] args) {
        int[] numArr = {110, 55, 20, 1, 80, 98, 60, 30, 20};

        Arrays.sort(numArr);
        System.out.println(Arrays.toString(numArr));
    }
}








/*TASK
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
