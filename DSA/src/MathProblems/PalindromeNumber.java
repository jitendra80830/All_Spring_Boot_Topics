package MathProblems;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        boolean palindromeNumber = palindromeNumber(x);
        System.out.println(palindromeNumber);

    }

    private static boolean palindromeNumber(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int reverseNumber = 0;

        while (x > reverseNumber) {
            int lastNum = x % 10;
            x /= 10;
            reverseNumber = (reverseNumber * 10) + lastNum;
        }
        if (x == reverseNumber || x == reverseNumber / 10) {
            return true;
        } else {
            return false;
        }


    }
}
