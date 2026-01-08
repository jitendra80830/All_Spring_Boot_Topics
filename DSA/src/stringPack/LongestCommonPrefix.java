package stringPack;

import java.util.Arrays;
import java.util.Collections;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String longestCommonPrefix = longestCommonPrefix(strs);
        System.out.println(longestCommonPrefix);
    }

    private static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        String ans = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                ans += s1.charAt(i);
            } else {
                return ans;
            }
        }
        return ans;
    }
}
