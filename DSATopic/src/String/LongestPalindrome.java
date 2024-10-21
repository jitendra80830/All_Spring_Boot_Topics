package String;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "abccccdd";
    }
    public int longestPalindrome(String str) {
        Map<Character ,Integer> map = new HashMap<>();
        for (char c : str.toCharArray()){
            map.put(c , map.getOrDefault(c ,0) + 1);
        }
        int result = 0;
        boolean oddFond = false;
        for (int c : map.values()){
            if(c %2 ==0){
                result+=c;
            }else {
                oddFond = true;
                result+=c-1;
            }
        }
        if(oddFond){
            result++;
        }
        return result;
    }
}
