package chap1;

import java.util.Scanner;

public class Multi99Table {
    public static void main(String args[]) {
        System.out.println(">>>>>>>Start");
        System.out.println("multiplication table");

        for (int i = 1; i <= 9; i++) {
           // System.out.println(i);
            for (int j = 1; j <= 9; j++) {
                //System.out.println(j);
                System.out.println( i + "*" + j + "=" +  i * j );
            }
        }
        System.out.println(">>>>>>>Finish");
    }
}
