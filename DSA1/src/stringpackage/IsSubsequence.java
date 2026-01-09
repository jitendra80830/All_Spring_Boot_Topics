package stringpackage;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "cda";
        String t = "ahbgdc";
        boolean sq = isSubsequence(s , t);
        System.out.println(sq);
    }

    private static boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;
        int count = 0;
        while (i<s.length()){
            while (j<t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    count++;
                    j++;
                    break;
                }
                j++;

            }
            i++;
        }
        if(count == s.length()){
            return true;
        }else {
            return false;
        }
    }
}
