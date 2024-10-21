package Maths;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        b = a+b;
        a = b-a;
        b = b -a;
        System.out.println(a +" "+ b);
    }
}
