package chap1;

import java.util.Scanner;

public class SumFor2 {
    public static void main(String[] args) {
        System.out.println(" >>>>>> Start ");

        Scanner stdIn = new Scanner(System.in);
        int n;
        System.out.println("Calculate the sum from 1 to n");

        do {
            System.out.println(" n :  ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("sum : " + sum);
        System.out.println(" >>>>>> Finish ");
    }
}
