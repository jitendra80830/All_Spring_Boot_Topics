package MathProblems;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int i = reverseNum(num);
        System.out.println(i);
    }

    private static int reverseNum(int num) {

        int rev = 0;
        int temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        //System.out.println(rev);
        return rev;

    }
}
