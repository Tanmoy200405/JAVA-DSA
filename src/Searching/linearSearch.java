package Searching;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Please enter 5 integers:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the target value to search for:");
        int target = scn.nextInt();

        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        for(int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return -1;
    }
}
