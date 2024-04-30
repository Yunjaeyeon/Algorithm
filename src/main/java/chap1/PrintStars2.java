package chap1;

import java.util.Scanner;

public class PrintStars2 {
    public static void main(String args[]) {
        System.out.println(">>>>>>>Start");

        Scanner stdIn = new Scanner(System.in);
        int n, w;
        System.out.println("print '*' n times and insert a newline after every w");

        do {
            System.out.print("n: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        do {
            System.out.print("w: ");
            w = stdIn.nextInt();
        } while (w <= 0 || w > n);

        for (int i = 0; i < n / w; i++)
            System.out.println("*".repeat(w));

        int rest = n % w;
        if (rest != 0)
            System.out.println("*".repeat(rest));


        System.out.println(">>>>>>>Finish");
    }
}
