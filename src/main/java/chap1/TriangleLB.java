package chap1;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String args[]) {
        System.out.println(">>>>>>>Start");

        Scanner stdIn = new Scanner(System.in);
        int n;

        do {
            System.out.print("n: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();

        }
        System.out.println(">>>>>>>Finish");
    }
}
