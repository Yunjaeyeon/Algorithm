package chap2;

public class YMD {

    int y;
    int m;
    int d;

    // 생성자
    public YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    static int after(YMD[] date) {
        int n = 0;
        for (int i = 0; i < date.length; i++) {
             n = date[i].d + 1;
            System.out.println("date : " + n );
        }
        return n;
    }

    public static void main(String[] args) {
        YMD[] ymds = {
                new YMD(2024, 05, 05),
                new YMD(2024, 05, 06),
                new YMD(2024, 05, 07)
        };

        after(ymds);

        // n일 뒤의 날짜를 반환

    }
}
