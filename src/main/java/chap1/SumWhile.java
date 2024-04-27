package chap1;

import java.util.Scanner;

public class SumWhile {

    public static void main(String args[]) {
        System.out.println(">>>>>>>Start");

        Scanner stdIn = new Scanner(System.in);
        System.out.println("Calculate the sum from 1 to n");
        System.out.println("n : ");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 0;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(" sum : " + sum);
        System.out.println(">>>>>>>Finish");
    }

}
