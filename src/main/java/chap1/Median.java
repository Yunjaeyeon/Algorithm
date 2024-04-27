package chap1;

import java.util.Scanner;

import static chap1.Max3Method.max3;

public class Median {

    //방법1
//    public static int med3(int a, int b, int c) { //1,3,2
//        if (a >= b)
//            if (b >= c)
//                return b;
//            else if (a <= c)
//                return a;
//            else
//                return c;
//        else if (a >= c)
//            return a;
//        else if (b >= c)
//            return c;
//        else
//            return b;
//    }

    //방법2

    public static int med3(int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a)) {
            return a;
        } else if ((a >= b && c <= b) || (a <= b && c >= b)) {
            return b;
        } else
            return c;
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
