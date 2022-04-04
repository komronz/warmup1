package Warmup_1;

public class endUp {
    public String endUp(String str) {
        if (str.length() >= 3 ){
            String a = str.substring(str.length()-3);
            String c = a.toUpperCase();
            String b = str.substring(0,str.length()-3);
            return b+c;
        }
        return str.toUpperCase();
    }
}
