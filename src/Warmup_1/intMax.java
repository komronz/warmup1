package Warmup_1;

public class intMax {
    public int intMax(int a, int b, int c) {
        int max = Math.max(a, b);

        if (c > max) {
            max = c;
        }

        return max;

    }
}
