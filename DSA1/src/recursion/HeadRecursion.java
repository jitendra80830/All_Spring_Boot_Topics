package recursion;

public class HeadRecursion {
    public static void main(String[] args) {
        int facVal = fac(5);
        System.out.println(facVal);
    }

    private static int fac(int n) {
        if(n ==0){
            return 1;
        }
        return n * fac(n-1);
    }
}
