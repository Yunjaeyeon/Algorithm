package chap1;

import java.util.Scanner;

public class Alternative2 {
    public static void main(String args[]) {
        System.out.println(">>>>>>>Start");

        Scanner stdIn = new Scanner(System.in);
        int n;
        System.out.println("Alternating between '+' and '-' for n times");

        do {
            System.out.println("n : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n / 2; i++) {
            System.out.print("+-");
        }

        if (n % 2 != 0) {
            System.out.print("-");
        }

        System.out.println("\n>>>>>>>Finish");
    }
}
