package chap2;

import java.util.Random;

public class MaxOfArray {
    //int[] a = {120, 130, 100, 150, 140};

    public static int maxOf(int[] a) {
        // 배열 a의 최대값을 구해 반환 // 키
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(">>>start");
        Random rand = new Random();
       // Scanner stdIn = new Scanner(System.in);

        System.out.println("Find the maximum value in array");
        System.out.println("Number of people :" );

        // 사람 수 난수 생성

        int num = 1 + rand.nextInt(10);
        int[] height = new int[num];

        // 키 난수로 생성
       for(int i = 0; i < height.length; i++){
           height[i] = 100 + rand.nextInt(90);
           System.out.println("height= " + height[i]);
       }


        System.out.println("The max value in Array is " + maxOf(height));


        System.out.println(">>>finish");
    }
}