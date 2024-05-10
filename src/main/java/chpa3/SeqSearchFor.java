package chpa3;

import java.util.Scanner;

public class SeqSearchFor {

   static int seqSearch(int[]a, int n, int key){
       for(int i =0; i < n; i++){
           if(a[i] == key)
               return i;
       }
       return -1;
   }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("element : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];                        // 요솟수가 num + 1인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("value : ");                    // 키값을 읽력받음
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num, ky);              // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("there's no result.");
        else
            System.out.println("the result is in [" + idx + "].");
    }
}
