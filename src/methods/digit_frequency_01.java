package methods;

import java.util.Scanner;

public class digit_frequency_01 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Number");
        int n = scn.nextInt();
        System.out.println("Digit");
        int d = scn.nextInt();
        int f = getDigitFrequency(n,d);
        System.out.println(f);
    }
    public static int getDigitFrequency(int n, int d ){
        int rv = 0;
        while(n>0){
            int dig = n % 10;
            n = n / 10;
            if(dig == d){
                rv++;
            }
        }
        return rv;

    }
}
