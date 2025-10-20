package Searching;

import java.util.Scanner;

public class minNo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        for(int i = 0;i< arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int result = min(arr);
        System.out.println(result);

    }
    static int min(int[] nums){
        for(int index = 0;index<nums.length;index++){
            int minimum = index;
            if(nums[index]< minimum){
                minimum = nums[index];
                return minimum;

            }
        }
        return -1;
    }
}
