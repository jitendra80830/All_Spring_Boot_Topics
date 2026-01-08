package stringPack;

import java.util.HashMap;
import java.util.Map;

public class ConsecutiveCharacters {
    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        int consecutiveCharacters = consecutiveCharacters(s);
        System.out.println(consecutiveCharacters);

        final Map<Integer, Integer> map = new HashMap<>();
        map.put(1, null);
        map.put(null ,null);
        //System.out.println(map);

    }

    private static int consecutiveCharacters(String s) {

        int ans = 1;
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        return ans;
    }
}
