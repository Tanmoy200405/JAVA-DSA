package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int inp = scn.nextInt();
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = inp;
        }
        Swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }

    static void Swap(int[]nums,int indx1,int indx2){
        int temp = nums[indx1];
        nums[indx1] = nums[indx2];
        nums[indx2] = temp;

    }
}
