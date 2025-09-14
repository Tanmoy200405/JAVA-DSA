package timecomplexity1;

public class linear { // Time complexity -> o(n)
    public static void main(String args[]){
        int[] arr = new int[]{1, 2, 3, 4, 5};

        //copy the element from one array to other array
        int[] newArr = new int[arr.length];
        //with the help of normal for loop
        for(int i = 0;i < arr.length;i++){
            newArr[i] = arr[i];
        }


        //with the helo of for each loop
        for(int n: arr){

            System.out.println(n);
        }

        //Task -> print each element of the array
        for (int i = 0; i < arr.length; i++) { // Time Complexity-> o(n) & space complexity is O(1)
            System.out.println(arr[i]);

        }
    }
}
