package basic;

import java.util.Scanner;

public class prime_no_02 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the lower range");
        int low = scn.nextInt();
        System.out.println("Enter the higher range");
        int high = scn.nextInt();
        for(int i =low;i<=high;i++){

            int count =0;
            for(int div = 2;div*div<=i;div++){
                if(i % div ==0){
                    count++;
                    break;


                }

            }
            if(count==0){
                System.out.println("prime number " +i);
            }



            }
        }

    }

