package chap1;

import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;

        System.out.println("Enter a two-digit positive number");

        do {
            System.out.print("no: ");
            no = stdIn.nextInt();
        } while (no < 10 || no > 90);

        System.out.println("no : " + no);
    }
}
