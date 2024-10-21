package String;

public class RepeatedStringMatch {
    public static void main(String[] args) {

        String a ="abcd";
        String b = "cdabcdab";
        int ans = repeatedStringMatch(a , b);
        System.out.println(ans);
    }

    private static int repeatedStringMatch(String a, String b) {
        int count = 1;
        int n = b.length()/a.length();
        String s = a;
        for (int i = 0; i <=n+1; i++) {
            if(s.contains(b)){
                return count;
            }
            s = s+a;
            count++;
        }
        return -1;
    }
}
