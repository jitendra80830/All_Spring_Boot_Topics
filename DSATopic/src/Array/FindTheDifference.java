package Array;

import java.util.HashSet;
import java.util.Set;

/*You are given two strings s and t.

String t is generated by random shuffling string s and then add one more letter at a random position.

Return the letter that was added to t.*/
public class FindTheDifference {
    public static void main(String[] args) {
        String s = "";
        String t = "y";
       char ans =  findTheDifference(s, t);
        System.out.println(ans);
    }

    private static char findTheDifference(String s, String t) {

        int ans[] = new int[26];
        for (int i = 0; i < t.length(); i++) {
            ans[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            ans[s.charAt(i) - 'a']--;
        }
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] > 0) {
                char ch = (char) ('a' + i);
                return ch;
            }
        }
        return ' ';
    }
}
