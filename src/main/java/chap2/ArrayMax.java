package chap2;

public class ArrayMax {
    public static void main(String[] args) {
        System.out.println(">>>start");
        int[] a = {1, 3, 5, 2, 0};

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("max = " + max);

        System.out.println(">>>finish");
    }
}
