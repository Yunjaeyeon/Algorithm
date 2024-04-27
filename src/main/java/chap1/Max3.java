package chap1;

import java.util.Scanner;
public class Max3 {
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
        System.out.println(" >>>>>> Finish ");


        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        System.out.println(" The Max value is :  " + max);
    }
}


