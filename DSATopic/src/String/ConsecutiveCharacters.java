package String;

import java.util.HashMap;

public class ConsecutiveCharacters {
    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        int consecutiveCharacters = consecutiveCharacters(s);
        System.out.println(consecutiveCharacters);
    }

    private static int consecutiveCharacters(String s) {

        int count = 1;
        int ans = 1;
        for (int i = 1; i <s.length() ; i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else {
                ans = Math.max(ans , count);
                count = 1;
            }
        }
        return ans;
    }
}
