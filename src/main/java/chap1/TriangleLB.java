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

//        // 오른쪽 위가 직각인 직각 삼각형
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i - 1; j++)
//                System.out.print(" ");
//            for (int j = 1; j <= n - i + 1; j++)
//                System.out.print('*');
//            System.out.println();
//        }

        //오른쪽 아래가 직각인 직각 삼각형
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
        System.out.println(">>>>>>>Finish");

//        //왼쪽 위가 직각인 직각 삼각형
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i + 1; j++)
//                System.out.print("*");
//            System.out.println();
//        }


//        //왼쪽 아래가 직각인 직각 삼각형
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++)
//                System.out.print("*");
//            System.out.println();
//
//        }

    }
}
