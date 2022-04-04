package Warmup_1;

public class front22 {
    public String front22(String str) {
        if(str.length()>=2){
            String a = str.substring(0,2);
            return a+str+a;
        }
        else if(str.length()>=1){
            String b = str.substring(0,1);
            return b+str+b;
        }
        return str;
    }
}
