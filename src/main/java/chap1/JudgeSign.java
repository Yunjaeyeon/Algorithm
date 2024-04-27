package chap1;
import java.util.Scanner;
public class JudgeSign {
    public static void main(String[] args) {
        System.out.println(" >>>>>> Start");

        Scanner stdIn = new Scanner(System.in);
        System.out.println("Enter");

        int n = stdIn.nextInt();
        String result = (n >=0) ? " >= 0 " : " <= 0";

        System.out.println(n + result);

        System.out.println(" >>>>>> Finish");




    }

}
