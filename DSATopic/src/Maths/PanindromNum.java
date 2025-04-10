package Maths;

public class PanindromNum {
    public static void main(String[] args) {
        int x = 1251;
        boolean isPal = isPalindromeNUm(x);
        System.out.println(isPal);
    }

    private static boolean isPalindromeNUm(int x) {

        if (x == 0 || x % 10 == 0) {
            return false;
        }
        int rev = 0;
        while (x > rev) {
            int last = x % 10;
            x /= 10;
            rev = (rev * 10)+last;
        }
        if(x==rev || x == rev/10){
            return true;
        }else {
            return false;
        }

    }
}
