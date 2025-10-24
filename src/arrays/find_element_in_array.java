package arrays;

public class find_element_in_array {
    public static void main(String[] args) {
        int[] arr = {6,15,30,40,4,11,9};
        int element = 9;
        int result = find(arr,element);
        System.out.println(result);
    }
    static int find(int[] arr,int element){
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

}
