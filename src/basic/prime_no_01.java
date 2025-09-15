package basic;

import java.util.Scanner;

public class prime_no_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int t = scn.nextInt();
        int count = 0;
        for(int div =2;div*div<=t;div++){
            if(t%div==0){
                count++;
                break;

            }

        }





        if (count == 0) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
