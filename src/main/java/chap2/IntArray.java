package chap2;

public class IntArray {

    public static void main(String[] args){
        System.out.println(">>>start");

        int[] a = new int[5];

        a[1] = 37; //37
        a[2] = 51;  //51
        a[4] = a[1] * 2; //74

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }


        System.out.println(">>>finish");
    }
}
