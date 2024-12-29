package ashok.in;

import java.util.HashMap;
import java.util.HashSet;

public class main {

    public static String patternCatcher(String str) {
        int n = str.length();
        String longestPattern = null;

        // Check all possible substring lengths from 1 to n/2
        for (int len = 1; len <= n / 2; len++) {
            for (int i = 0; i <= n - len * 2; i++) {
                String pattern = str.substring(i, i + len);

                // Check if this pattern appears again in the string
                for (int j = i + len; j <= n - len; j++) {
                    if (str.substring(j, j + len).equals(pattern)) {
                        if (longestPattern == null || pattern.length() > longestPattern.length()) {
                            longestPattern = pattern;
                        }
                    }
                }
            }
        }

        return longestPattern != null ? "Yes " + longestPattern : "No pattern";
    }
    public static String patternCatcher2(String str) {
        int n = str.length();
        String longestPattern = null;
        HashMap<String, Integer> map = new HashMap<>();

        // Check all possible substring lengths from 1 to n/2
        for (int len = 1; len <= n / 2; len++) {
            for (int i = 0; i <= n - len; i++) {
                String pattern = str.substring(i, i + len);

                if (map.containsKey(pattern)) {
                    int previousIndex = map.get(pattern);
                    if (previousIndex + len <= i) { // Ensure it's a repeating adjacent pattern
                        if (longestPattern == null || pattern.length() > longestPattern.length()) {
                            longestPattern = pattern;
                        }
                    }
                } else {
                    map.put(pattern, i);
                }
            }
            map.clear(); // Clear the map for the next length to avoid false positives
        }

        return longestPattern != null ? "Yes " + longestPattern : "No pattern";
    }

        public static void main(String[] args) {
            /*String input = "sskfssbbb9bbb";
            System.out.println(patternCatcher2(input));  // Output: Yes a2*/
            int n =6; // Input value
            int sum = 0;

            // Loop through all numbers below n
            for (int i = 1; i < n; i++) {
                // Check if the number is a multiple of 3 or 5
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }

            // Print the result
            System.out.println("The sum of multiples of 3 and 5 below " + n + " is: " + sum);
        }


}
