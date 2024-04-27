package chap1;

import java.util.Scanner;

import static chap1.Max3Method.max3;

public class Median {

    public static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a >= c)
            return a;
        else if (b >= c)
            return c;
        else
            return b;
    }


    public static void main(String[] args) {
        System.out.println(" >>>>>> Start ");

        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다");

        System.out.println(" a의 값 :  ");
        int a = stdIn.nextInt();
        System.out.println(" b의 값 :  ");
        int b = stdIn.nextInt();
        System.out.println(" c의 값 :  ");
        int c = stdIn.nextInt();

        med3(a, b, c);

        System.out.println(" The Median value is :  " + c);
        System.out.println(" >>>>>> Finish ");

    }
}
