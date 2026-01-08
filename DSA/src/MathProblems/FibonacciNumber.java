package MathProblems;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 2;
        int fibonacciNum = fibonacciNum(n);
        System.out.println(fibonacciNum);
    }

    private static int fibonacciNum(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;
        ans[1] = 1;
        for (int i = 2; i <= n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n];
    }
}
