package String;

public class ReverseStringII {
    public static void main(String[] args) {
        String s = "abcd";
        int k = 2;
        //reverseStringII(s , k);
        /*String reverse = reverse(s);
        System.out.println(reverse);*/
        String s1 = reverseStringII(s, k);
        System.out.println(s1);
    }

    private static String reverseStringII(String s, int k) {
        char ch[] = s.toCharArray();
        int i = 0;
        int n = s.length();
        while (i < n){
            int j = Math.min(i+k-1 , n-1);
           revers2(ch , i , j);
           i = i+2*k;
        }
        String ans = "";
        for (int k1 = 0; k1 <ch.length; k1++) {
            ans+=ch[k1];
        }
        return ans;

    }
    public static void revers2(char[] ch , int i , int j ){
        while (i<j){
            char left = ch[i];
            ch[i] = ch[j];
            ch[j] = left;
            i++;
            j--;
        }
    }
    public static String reverse(String s , int i , int j){
        char[] ch = s.toCharArray();
        /*int i = 0;
        int j = s.length()-1;*/
        while (i<=s.length()/2){
            char left = ch[i];
            ch[i] = ch[j];
            ch[j] = left;
            i++;
            j--;
        }
        String ans = "";
        for (int k = 0; k <ch.length; k++) {
            ans+=ch[k];
        }
        return ans;
    }
}
