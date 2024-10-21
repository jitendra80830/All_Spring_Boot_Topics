package Maths;

public class NeonNumber {
    public static void main(String[] args) {
        int n = 7;
        boolean neonNumber = neonNumber(n);
        System.out.println(neonNumber);
    }

    private static boolean neonNumber(int n) {
        int sq = n * n;
        int sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        if (n == sum) {
            return true;
        } else {
            return false;
        }
    }
}
