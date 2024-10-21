package String;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String str = "aba";
        boolean repeatedSubstringPattern = repeatedSubstringPattern(str);
        System.out.println(repeatedSubstringPattern);
    }

    private static boolean repeatedSubstringPattern(String str) {
        int n = str.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                int time = n / i;
                String pattern = str.substring(0, i);
                StringBuffer sb = new StringBuffer();
                while (time != 0) {
                    sb.append(pattern);
                    time--;
                }
                if (str.equals(sb.toString())) {
                    return true;
                }
            }

        }
        return false;
    }
}
