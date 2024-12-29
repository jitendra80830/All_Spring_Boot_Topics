package Maths;

public class LCM {
    public static void main(String[] args) {
        int n1 = 36;
        int n2 = 24;
        int lcm = lcm(n1, n2);
        System.out.println(lcm);
    }

    private static int lcm(int n1, int n2) {
        int on1 = n1;
        int on2 = n2;
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (on1 * on2) / gcd;
        return lcm;
    }
}
