package Maths;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 3;
        int ans = climbingStairs(n);
        System.out.println(ans);
    }

    private static int climbingStairs(int n) {
        int stairs[] = new int[n+1];
        stairs[0] = 1;
        stairs[1] = 1;
        for (int i = 2; i <=n ; i++) {
            stairs[i] = stairs[i-1] + stairs[i-2];
        }
        return stairs[n];
    }
}
