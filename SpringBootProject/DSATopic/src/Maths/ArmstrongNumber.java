package Maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 159;
        boolean armstrongNumber = armstrongNumber(n);
        System.out.println(armstrongNumber);
    }

    private static boolean armstrongNumber(int n) {

        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int lastNumber = temp % 10;
            sum += lastNumber * lastNumber * lastNumber;
            temp /= 10;
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}
