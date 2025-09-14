package basic;

import java.util.Scanner;

public class prime_no_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int t = scn.nextInt();
        int count = 0;

        for (int div = 1; div * div <= t; div++) {
            if (t % div == 0) {
                count++;
                // Check if div is not the same as t/div to count both divisors
                if (div != t / div) {
                    count++;
                }
            }
        }

        if (count == 2) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
