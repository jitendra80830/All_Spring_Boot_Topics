package stringpackage;

import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        int ans = longestPalindrome(s);
        System.out.println(ans);
    }

    private static int longestPalindrome(String s) {

        HashMap<Character , Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) ,0)+1);
        }
        int result = 0;
        boolean oddFound = false;
        for (int c : map.values()){
            if(c % 2 == 0){
                result+=c;
            }else{
                oddFound = true;
                result+=c-1;
            }
        }
        if(oddFound){
            result++;
        }
        return result;
    }
}
