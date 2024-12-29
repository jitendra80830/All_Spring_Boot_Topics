package String;

public class SwapStringWithouwTemp {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        swap(str1 ,str2);
    }

    private static void swap(String a, String b) {

        a = a + b;
        b = a.substring( 0 ,a.length() - b.length());
        a = a.substring(b.length());
        System.out.println(a+" "+b);

    }
}
