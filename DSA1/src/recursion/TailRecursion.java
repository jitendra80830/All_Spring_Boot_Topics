package recursion;

public class TailRecursion {
    public static void main(String[] args) {
        fac(5 ,1);
    }

    private static int fac(int n, int ans) {
        if(n==0){
            return ans;
        }
        return fac(n-1 , n * ans);
    }
}
