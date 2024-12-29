package Maths;

public class ClosestPrimeNumbersInRange {
    public static void main(String[] args) {
        int left = 10;
        int right = 19;
        closestPrimeNumbersInRange(left , right);
    }

    private static int[] closestPrimeNumbersInRange(int left, int right) {
        return new int[0];
    }
   /* private static int countPrime(int n) {
        if(n<=2){
            return 0;
        }
        boolean prime[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }
        for (int i = 2; i*i< n; i++) {
            if(prime[i]){
                for (int j = i*i; j <n ; j+=i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if(prime[i]){
                //count++;
            }
        }
    }*/
}
