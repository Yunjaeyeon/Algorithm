package chap2;

import java.util.Arrays;
import java.util.Scanner;

public class ReserveArray {

    static void swap(int[] arr, int idx1, int idx2) {
        int t = arr[idx1]; //arr[idx1] = {2, 5, 1, 3, 9, 6, 7};
        arr[idx1] = arr[idx2]; //{2, 5, 1} = {9,6,7}
        arr[idx2] = t;
    }

    static void reserve(int[] arr){
        for (int i = 0; i < arr.length /2; i++) {
            swap(arr, i ,arr.length -1 - i);
        }
    }


    public static void main(String[] args) {
        System.out.println(">>>start");
        Scanner stdIn = new Scanner(System.in);

        System.out.print("numbers of element :");
        int arr = stdIn.nextInt();

        int[] x = new int[arr]; // 입력받을 요소의 수
        //int[] arr = {2, 5, 1, 3, 9, 6, 7};

        for (int i = 0; i < arr; i++) { // 요소 입력받기
            System.out.print("x[i]:"  );
            x[i] = stdIn.nextInt();

        }

        reserve(x);
        System.out.println("The array has been reserved" );
        System.out.println(" x= " + Arrays.toString(x));
        System.out.println(">>>finish");



//        //배열 뒤집기
//        for (int i = 0; i < arr.length/2 ; i++) {
//            swap(arr, i, arr.length - i - 1);
//
//        }
//
//        // 뒤집은 배열 출력
//        for (int arrs : arr) {
//            System.out.println("arrs : " + arrs);
//        }


    }


}
