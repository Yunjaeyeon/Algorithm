package chap1;

import java.util.Scanner;

public class SumFor {

    static int sum = 0;
    //가우스 법칙
    public static int sumOf(int a, int b) {
        return (a + b) * (b - a + 1) / 2;
    }


    public static void main(String[] args) {
        System.out.println(" >>>>>> Start ");

        Scanner stdIn = new Scanner(System.in);

        System.out.println(" a의 값 :  ");
        int a = stdIn.nextInt();
        System.out.println(" b의 값 :  ");
        int b = stdIn.nextInt();

        System.out.println("Calculate the sum from a to b");
        //System.out.println( "n : ");

        //int n = stdIn.nextInt();

        sum = sumOf(a, b);

//        int sum = 0;
//        for(int i = 0; i <= n; i++) {
//            sum += i;
//        }

        System.out.println("sum : " + sum);
        System.out.println(" >>>>>> Finish ");
    }


}
