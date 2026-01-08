package stringPack;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        int lengthOfLongestSubstring = lengthOfLongestSubstring(s);
        System.out.println(lengthOfLongestSubstring);
    }

    private static int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while (i < s.length()) {
            if (!st.contains(s.charAt(i))) {
                st.add(s.charAt(i++));
                max = Math.max(max, st.size());
            } else {
                st.remove(s.charAt(j++));
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
