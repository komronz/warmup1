package Warmup_1;

public class frontBack {
    public String frontBack(String str) {
        if (str.length() >= 2){
            String a = str.substring(str.length()-1,str.length());
            String a1 = str.substring(0,1);
            return a+str.substring(1,str.length()-1)+a1;
        }

        return str;

    }
}
