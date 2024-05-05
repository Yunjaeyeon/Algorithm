package chap2;

//신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분호를 구함

import java.util.Scanner;


public class ClassExamination {
    // 시력의 분포(0.0부터 0.1 단위로 21개)
    static final int VMAX = 21;

    static class PhyscData {


        String name;
        int height;
        double vision;

        //--- 생성자(constructor) ---//
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 키의 평균값을 구하기

    static double aveHeight(PhyscData[] dat) {
        double sum = 0;

        for (int i = 0; i < dat.length; i++) {
            sum += dat[i].height;
        }

        return sum / dat.length;
    }

    // 시력의 평균값을 구하기

    static void distVision(PhyscData[] dat, int[] dist) {

        //먼저 dat를 통해 시력이 포함되어 있는 건강검진 데이터를 받아온다.
        for (int i = 0; i < dat.length; i++) {
            // 빋아 온 데이터에서 시력을 0.0 ~ 2.0 총 21개의ㅏ 배열로 나눈다
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) { // 만약 시력이 0.0 ~ 2.0 사이에 있다면
                dist[(int) (dat[i].vision * 10)]++;//dist의 해당 시력에 해당하는 배열을= 요소를 ++ 시킨다.
            }
        }

    }

    public static void main(String[] args) {
        //Scanner stdIn = new Scanner(System.in);
        //데이터 생성

        PhyscData[] x = {
                new PhyscData("AAA", 162, 0.3),
                new PhyscData("BBB", 173, 0.7),
                new PhyscData("CCC", 175, 2.0),

        };


        // 시력의 분포
        int[] vdist = new int[VMAX];

        System.out.println("--------------------");

        System.out.printf("\naverHeight: %5.1fcm\n", aveHeight(x));

        distVision(x,vdist);

        System.out.println("\nvision");
        for (int i = 0; i < VMAX; i++)
            System.out.printf("%3.1f～: %2d\n", i / 10.0, vdist[i]);
    }

    }


