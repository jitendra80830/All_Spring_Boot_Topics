package String;

public class Subsequence {
    public static void main(String[] args) {
        String s = "adh";
        String t = "ahbgdc";
        boolean subsequence = isSubsequence(s, t);
        boolean subsequence2 = subsequence2("ahbgdc", "axc");
        System.out.println(subsequence2);
        //System.out.println(subsequence);

    }

    private static boolean subsequence2(String s, String t) {
        int k = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(k)) {
                str += s.charAt(i);
                k++;
            }
        }
        if (str.equals(t)) {
            return true;
        } else {
            return false;
        }


    }

    private static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < s.length()) {
            char sChar = s.charAt(i);
            while (j < t.length()) {
                if (s.charAt(i) == t.charAt(j)) {
                    count++;
                    break;
                }
                j++;
            }
            i++;
        }
        if (count == s.length()) {
            return true;
        } else {
            return false;
        }

    }
}
