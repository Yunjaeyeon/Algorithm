package chap2;

public class ReserveArray {


    public static void main(String[] args) {
        System.out.println(">>>start");

        int[] arr = {2, 5, 1, 3, 9, 6, 7};

        //reserve array
        for (int i = 0; i < arr.length / 2; i++) {
           // System.out.println("arr = " + arr[i]);
            swap(arr, i, arr.length - 1 - i); // swap 메소드 호출 시 뒤집을 범위의 인덱스 전달
        }

        for(int arrs : arr){
            System.out.println("arrs = " + arrs);
        }
        System.out.println(">>>finish");
    }

    static void swap(int[] arr, int idx1, int idx2) {
        int t = arr[idx1]; // 6
        arr[idx1] = arr[idx2]; // idx1에 idx2의 값을 할당
        arr[idx2] = t; // index2에는 임시변수t(idx1)에 저장된 값을 할당
    }
}
