package Warmup_1;

public class max1020 {
    public int max1020(int a, int b) {
        if (b > a) {
            int a1 = a;
            a = b;
            b = a1;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;

    }

}
