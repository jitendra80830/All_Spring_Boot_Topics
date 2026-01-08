package MathProblems;

public class Power {
    public static void main(String[] args) {
        int n = 3;
        int x = 2;
        int calculatePower = calculatePower(n, x);
        System.out.println(calculatePower);
    }

    private static int calculatePower(int n, int x) {
        if (x == 0) {
            return 1;
        }
        return n * calculatePower(n, x - 1);
    }

}
