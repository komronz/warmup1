package Warmup_1;

public class close10 {
    public int close10(int a, int b) {
        int a1 = Math.abs(10-a);
        int a2 = Math.abs(10-b);
        int q  = 10;
        if (a1<a2){
            return a;
        }
        else if (a1 == a2){
            return 0;
        }
        return b;
    }
}
