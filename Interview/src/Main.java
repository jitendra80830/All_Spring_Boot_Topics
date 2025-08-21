import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s1 = "abcde";
        //
        //clock wise rotation
        //
        //abcde -> eabcd -> deabc -> cdeab -> bcdea
        //
        //anticlock wise rotation
        //
        //abcde -> bcdea -> cdeab
        //
        String match = "bcdea";
        //
        rotaion(s1, match);

    }

    private static void rotaion(String s1, String match) {

        char[] ch = s1.toCharArray();
        int flag = 0;
        int count1 = 0;
        int count = 0;
        int i =0;
        for (i = 0; i < s1.length(); i++) {
            char temp = ch[0];

            for (int j = 1; j < ch.length; j++) {
                ch[j - 1] = ch[j];
            }
            ch[ch.length - 1] = temp;
            count++;

            //String st = "";
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < ch.length; j++) {
                sb.append(ch[j]);
            }
            if(match.equals(sb.toString())){
                System.out.println("Matched");
                flag = 1;
                count1 = count;
                //return;
                break;
            }
        }
        count = 0;
        int count2 = 0;
        char ch1[] = s1.toCharArray();
        int k =0;
        for (k = s1.length()-1; k>=0; k--) {
            char temp = ch1[ch1.length-1];
            for (int j  = ch1.length-2;j>=0;j--) {
                ch1[j+1] = ch1[j]; // abcde = 01234
            }
            ch1[0] = temp;
            //String st = "";
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < ch1.length; j++) {
                sb.append(ch1[j]);
            }
            if(match.equals(sb.toString())){
                System.out.println("Matched");
                flag = 1;
                count2 = count;
                break;
                //return;
            }
        }
        if(i<k){
            System.out.println("antyClock "+i);
        }else {
            System.out.println("clock wise"+k);
        }
        //System.out.println(Math.min(i , k));
        if(flag == 0){
            System.out.println("String not matched");
        }

    }


}