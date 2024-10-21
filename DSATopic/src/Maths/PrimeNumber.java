package Maths;

public class PrimeNumber {
    public static void main(String[] args) {
        /*int n = 9;
        boolean prime = prime(n);*/
       // System.out.println(prime);
        //int count = 0;
        /*for (int i = 1; i<10; i++) {
            if(prime(i)){
                count++;
            }
        }
        System.out.println(count);*/
        int countPrimes = countPrimes(100);
        System.out.println(countPrimes);

    }
    public static int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        boolean []isprime=new boolean[n];
        for(int i=0;i<n;i++){
            isprime[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(isprime[i]){
                for(int j=i*i;j<n;j+=i){
                    isprime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(isprime[i]){
                count++;
            }
        }
        return count;
    }

    private static boolean prime(int n) {
        int count = 0;
        for (int i = 1; i <=n ; i++) {
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        else {
            return false;
        }
    }
}
