package Warmup_1;

public class missingChar {
    public String missingChar(String str, int n) {
        String a = str.substring(0,n);
        String a1 = str.substring(n+1,str.length());
        return a + a1;
    }

}
