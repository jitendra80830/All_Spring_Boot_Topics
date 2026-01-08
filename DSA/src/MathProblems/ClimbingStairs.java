package MathProblems;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        int climbingStairs = climbingStairs(n);
        System.out.println(climbingStairs);
    }

    private static int climbingStairs(int n) {

        int[] ans = new int[n+1];
        ans[0] = 1;
        ans[1] = 1;
        for (int i = 2; i <=n ; i++) {
            ans[i] = ans[i-1] + ans[i-2];
        }
        return ans[n];
    }
}
