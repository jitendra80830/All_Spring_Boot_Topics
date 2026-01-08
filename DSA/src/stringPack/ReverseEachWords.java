package stringPack;

public class ReverseEachWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        reverseEachWords(s);
    }

    private static void reverseEachWords(String str) {

        String[] arr = str.split(" ");
        int n = 0;
        for (String s : arr) {
            n++;
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            if (n < arr.length - 1) {
                System.out.print(" ");
            }
        }

    }
}
