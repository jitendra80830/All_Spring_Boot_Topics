package String;

public class LongestUncommonSubsequence {
    public static void main(String[] args) {
        String a = "abc";
        String b = "cde";
        longestUncommonSubsequence(a , b);
    }

    private static int longestUncommonSubsequence(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
        if(a.length() > b.length()){
            return a.length();
        }else {
            return b.length();
        }
    }
}
