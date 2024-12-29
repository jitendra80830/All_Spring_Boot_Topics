package Maths;

public class CountPrimeNumber {
    public static void main(String[] args) {
        int n = 10;
        int countPrime = countPrime(n);
        System.out.println(countPrime);
    }

    private static int countPrime(int n) {
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
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(prime[i]){
                count++;
                System.out.println(i);
            }
        }
        return count;
    }
}
