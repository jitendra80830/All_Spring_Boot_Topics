package Array;

public class SwapTwoWithoutThirdVar {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapTwoWithoutThirdVar(a, b);
        swapTwoWithThirdVar(a , b);
        swapTwoUsingStringThirdVar(a , b);

    }

    private static void swapTwoUsingStringThirdVar(int a, int b) {
        String str = a+":"+b;
        //System.out.println(str);
        String[] s = str.split(":");
        a = Integer.parseInt(s[1]);
        b = Integer.parseInt(s[0]);
        System.out.println(a+" : "+b);
    }

    private static void swapTwoWithThirdVar(int a, int b) {
        int temp =a;
        a = b;
        b = temp;
        System.out.println(a+" : "+b);
    }

    private static void swapTwoWithoutThirdVar(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " : " + b);
    }
}
