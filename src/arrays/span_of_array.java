package arrays;

import java.util.Arrays;

public class span_of_array {
    public static void main(String[] args) {
        int[] arr = {6,15,30,40,4,11,9};
        int result = span(arr);
        System.out.println(result);


    }

    static int span(int[] arr){
        int high = arr[0];
        int smallest = arr[0];

        for(int i = 0;i< arr.length;i++){
            if(arr[i]>high){
                high = arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        int span = high - smallest;
        return span;

    }
}
