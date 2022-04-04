package Warmup_1;

public class stringE {
    public boolean stringE(String str) {
        int e = 0;
        for (int i = 0; i < str.length(); i++) {
            String a1 = str.substring(i,i+1);
            if (a1.equals("e")){
                e++;

            }
        }
        if (e>0&&e<=3){
            return true;
        }
        return false;
    }

}
