package Warmup_1;

public class mixStart {
    public boolean mixStart(String str) {
        if (str.length() > 2) {
            String m = str.substring(1,3);
            if (m.startsWith("ix")) {
                return true;
            }
        }
        return false;
    }

}
