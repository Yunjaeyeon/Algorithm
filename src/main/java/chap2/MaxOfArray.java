package chap2;

import java.util.Scanner;

public class MaxOfArray {
    int[] a = {120, 130, 100, 150, 140};

    public static int maxOf(int[] a) {
        // 배열 a의 최대값을 구해 반환
        int max = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(">>>start");
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Find the maximum value in array");
        System.out.println("Number of people :" );

        int num = stdIn.nextInt();
        int[] height = new int[num];

       for(int i = 0; i < height.length; i++){
           height[i] = stdIn.nextInt();
           System.out.println("height[i] = " + height[i]);
       }

        System.out.println("The max value in Array is " + maxOf(height));


        System.out.println(">>>finish");
    }
}