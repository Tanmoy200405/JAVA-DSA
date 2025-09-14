package timecomplexity1;

public class constant { //o(1)
    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3, 4, 5};
        arr[0] = arr[0] + 10;
        System.out.println(arr[0]); //Time complexity-> 0(1)

    }
}


//it is best time complexity
