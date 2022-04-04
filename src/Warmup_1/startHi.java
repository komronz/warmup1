package Warmup_1;

public class startHi {
    public boolean startHi(String str) {
        if (str.length()>=2) {
            if (str.startsWith("hi")) {
                return true;
            }
        }
        return false;
    }

}
