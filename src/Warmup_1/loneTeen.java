package Warmup_1;

public class loneTeen {
    public boolean loneTeen(int a, int b) {
        if (( a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
            return false;
        }else
            return a != b;
    }

}
