package chap1;

import java.util.Scanner;

public class PrintStarts1 {
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

        for (int i = 0; i < n; i++) {
            System.out.print("*");

            if (i % w == w - 1) { // i의 값을 w값으로 나눈 나머지가 w-1일 때 줄 바끔 ex) w가 5라면 i값은 4, 9, 14일 때 줄바꿈
                System.out.println();
            }
        }
        if (n % w != 0)// n값이 w값의 배수가 아니라면 여기서 줄 바꿈
            System.out.println();

        System.out.println(">>>>>>>Finish");
    }


}

