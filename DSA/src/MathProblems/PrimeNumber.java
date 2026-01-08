package MathProblems;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 19;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        boolean prime = isPrime(num);
        System.out.println(prime);
    }

    private static boolean isPrime(int num) {

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}
